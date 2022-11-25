package com.soldesk.ho0706.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SelectMain {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String addr = "jdbc:oracle:thin:@192.168.0.100:1521:xe";
			con = DriverManager.getConnection(addr, "lp2011a", "rudgh6401");
			String sql = "select p_name, p_price, p_shopName "
					+ "from jul06_product_ho order by p_shopName, p_name";
			
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				// rs.getXXX("필드명") : 현재 쳐다보고 있는 데이터의 그 필드 가져오기
				System.out.println(rs.getString("p_name"));
				System.out.println(rs.getInt("p_price"));
				System.out.println(rs.getString("p_shopName"));
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
