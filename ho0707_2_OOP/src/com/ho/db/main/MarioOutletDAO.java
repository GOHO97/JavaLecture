package com.ho.db.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.soldesk.ho.db.manager.HoDBManager;

public class MarioOutletDAO {
	
	public static String regFloor(Consolevalue cv) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			String addr = "jdbc:oracle:thin:@192.168.0.100:1521:xe";
			con = HoDBManager.hi(addr, "lp2011a", "rudgh6401");
			String sql = "insert into JUL06_LOCATION_HO values"
					+ "(JUL06_Location_HO_seq.nextval, ?, ?, ? )";
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, cv.getL_hall());
			pstmt.setInt(2, cv.getL_floor());
			pstmt.setString(3, cv.getWhat());
			
			if(pstmt.executeUpdate() >= 1) {
				return "성공★(찡긋)";
			} else {
				return "실패";
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "실패(ㅜ_ㅜ)";
		} finally {
			HoDBManager.bye(con, pstmt, null);
		}
	}
	
	public static String selectFloor() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String addr = "jdbc:oracle:thin:@192.168.0.100:1521:xe";
			con = HoDBManager.hi(addr, "lp2011a", "rudgh6401");
			String sql = "select l_hall, l_floor, s_name"
					+ " from jul06_location_ho, jul06_shop_ho"
					+ " where l_no = s_locationNum"
					+ " order by l_hall, l_floor";
			
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			//수정 가능한 문자열 객체
			StringBuffer sb = new StringBuffer();
			
			String s = "";
			
			while(rs.next()) {
				s = String.format("%d관, %d층, %s\r\n", rs.getInt("l_hall"), rs.getInt("l_floor"), rs.getString("s_name"));
				sb.append(s);
			}
			
			return sb.toString();
			
		} catch (Exception e) {
			return "제대로 안 하냐?";
		} finally {
			HoDBManager.bye(con, pstmt, rs);
		}
	}
}
