package com.soldesk.ho0706.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ConnectMain2 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			String addr = "jdbc:oracle:thin:@192.168.0.100:1521:xe";
			con = DriverManager.getConnection(addr, "lp2011a", "rudgh6401");
			System.out.print("관 : ");
			int l_hall = k.nextInt();
			System.out.print("층 : ");
			int l_floor = k.nextInt();
			System.out.print("뭐 : ");
			String l_cate = k.next();
			
			//변수 값 들어갈 자리에 ? 넣고, ''빼고 ;빼고
			String sql = "insert into JUL06_LOCATION_HO values(jul06_location_ho_seq.nextval, ?, ?, ?)";
			pstmt = con.prepareStatement(sql); 

			// ?에 값 채우기[pstmt.setXXX(물음표번호, 값);]
			pstmt.setInt(1, l_hall);
			pstmt.setInt(2, l_floor);
			pstmt.setString(3, l_cate);
			
			int row = pstmt.executeUpdate(); 
			if(row == 1) {
				System.out.println("성공");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {pstmt.close();} catch (Exception e) {e.printStackTrace();}
		try {con.close();} catch (Exception e) {e.printStackTrace();}
	}
}
