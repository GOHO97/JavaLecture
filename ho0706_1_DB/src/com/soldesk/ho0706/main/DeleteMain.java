package com.soldesk.ho0706.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteMain {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			String addr = "jdbc:oracle:thin:@192.168.0.100:1521:xe";
			con = DriverManager.getConnection(addr, "lp2011a", "rudgh6401");
			System.out.print("뭐 : ");
			String dt = k.next();
			// 미완성
			String sql = "delete from JUL06_PRODUCT_HO "
					+ "where p_name like '%'||?||'%'";
			// 총괄 매니저
			pstmt = con.prepareStatement(sql);
			// ?채우기
			pstmt.setString(1, dt);
			// 실행 & 결과처리
			if(pstmt.executeUpdate() >= 1) {
				System.out.println("성공");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		k.close();
		try {pstmt.close();} catch (SQLException e1) {e1.printStackTrace();}
		try {con.close();} catch (SQLException e) {e.printStackTrace();}
	}
}
