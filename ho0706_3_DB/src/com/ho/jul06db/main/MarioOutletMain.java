package com.ho.jul06db.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.soldesk.ho.db.manager.HoDBManager;

public class MarioOutletMain {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			String addr = "jdbc:oracle:thin:@192.168.0.100:1521:xe";
			con = HoDBManager.hi(addr, "lp2011a", "rudgh6401");
			
			//관, 층, 매장명, 전화번호를 관 층 매장명 가나다순 정렬
			String sql = "select l_hall, l_floor, s_name, s_call"
					+ " from jul06_location_ho, jul06_shop_ho"
					+ " where l_no = s_locationNum"
					+ " order by l_hall, l_floor, s_name";
			
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				System.out.println(rs.getInt("l_hall"));
				System.out.println(rs.getInt("l_floor"));
				System.out.println(rs.getString("s_name"));
				System.out.println(rs.getString("s_call"));
				System.out.println("-----------");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		HoDBManager.bye(con, pstmt, rs);
	}
}
