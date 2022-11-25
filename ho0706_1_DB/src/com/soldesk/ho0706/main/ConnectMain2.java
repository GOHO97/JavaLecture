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
			System.out.print("�� : ");
			int l_hall = k.nextInt();
			System.out.print("�� : ");
			int l_floor = k.nextInt();
			System.out.print("�� : ");
			String l_cate = k.next();
			
			//���� �� �� �ڸ��� ? �ְ�, ''���� ;����
			String sql = "insert into JUL06_LOCATION_HO values(jul06_location_ho_seq.nextval, ?, ?, ?)";
			pstmt = con.prepareStatement(sql); 

			// ?�� �� ä���[pstmt.setXXX(����ǥ��ȣ, ��);]
			pstmt.setInt(1, l_hall);
			pstmt.setInt(2, l_floor);
			pstmt.setString(3, l_cate);
			
			int row = pstmt.executeUpdate(); 
			if(row == 1) {
				System.out.println("����");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {pstmt.close();} catch (Exception e) {e.printStackTrace();}
		try {con.close();} catch (Exception e) {e.printStackTrace();}
	}
}
