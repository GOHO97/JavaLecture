package com.soldesk.ho0706.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectMain2 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			String addr = "jdbc:oracle:thin:@192.168.0.100:1521:xe";
			con = DriverManager.getConnection(addr, "lp2011a", "rudgh6401");
			String sql = "select l_hall, avg(p_price) from"
					+ " jul06_location_ho, jul06_shop_ho, jul06_product_ho"
					+ " where l_no = s_locationNum and s_name = p_shopName"
					+ " group by l_hall";
			
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt("l_hall"));
				System.out.printf("%.2f\r\n",rs.getDouble("avg(p_price)"));
				System.out.println("------");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {rs.close();} catch (SQLException e1) {e1.printStackTrace();}
		try {pstmt.close();} catch (SQLException e1) {e1.printStackTrace();}
		try {con.close();} catch (SQLException e) {e.printStackTrace();}
	}
}
