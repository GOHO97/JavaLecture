package com.ho.mogidb.main;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.ho.mogidb.DTO.MosquitoInfoDTO;
import com.soldesk.ho.db.manager.HoDBManager;

public class MosquitoDAO {
	
	private static final MosquitoDAO MDA = new MosquitoDAO();
	
	public MosquitoDAO() {
		
	}
	
	public static MosquitoDAO getMda() {
		return MDA;
	}


	public MosquitoInfoDTO getMosquitoInfo() {
		HttpURLConnection huc = null;

		try {
			Date now = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
			String now2 = sdf.format(now);
			String s = "http://openapi.seoul.go.kr:8088/575a4655496b636839386f58586542/json/MosquitoStatus/1/1/" + now2;
			URL u = new URL(s);
			huc = (HttpURLConnection) u.openConnection();
			InputStream is = huc.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");

			JSONParser jp = new JSONParser();
			JSONObject jo = (JSONObject) jp.parse(isr);
			JSONObject ms = (JSONObject) jo.get("MosquitoStatus");
			JSONArray ja = (JSONArray) ms.get("row");
			
			JSONObject mosquitoInfo = (JSONObject) ja.get(0);
			double water = Double.parseDouble((String) mosquitoInfo.get("MOSQUITO_VALUE_WATER"));
			double house = Double.parseDouble((String) mosquitoInfo.get("MOSQUITO_VALUE_HOUSE"));
			double park = Double.parseDouble((String) mosquitoInfo.get("MOSQUITO_VALUE_PARK"));
			
			return new MosquitoInfoDTO(water, house, park);
		
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			huc.disconnect();
		}
	}
	
	public String regMosquitoInfo(MosquitoInfoDTO mi) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			String addr = "jdbc:oracle:thin:@192.168.0.100:1521:xe";
			con = HoDBManager.hi(addr, "lp2011a", "rudgh6401");
			String sql = "insert into JUL08_MOSQUITO_HO values (to_char(sysdate, 'YYYY-MM-DD'), ?, ?, ?)";

			pstmt = con.prepareStatement(sql);

			pstmt.setDouble(1, mi.getWater());
			pstmt.setDouble(2, mi.getHouse());
			pstmt.setDouble(3, mi.getPark());

			if (pstmt.executeUpdate() >= 1) {
				return "성공";
			} else {
				return "실패";
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "실패";
		} finally {
			HoDBManager.bye(con, pstmt, null);
		}
	}

	

}
