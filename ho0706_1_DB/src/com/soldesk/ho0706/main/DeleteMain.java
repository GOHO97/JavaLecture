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
			System.out.print("�� : ");
			String dt = k.next();
			// �̿ϼ�
			String sql = "delete from JUL06_PRODUCT_HO "
					+ "where p_name like '%'||?||'%'";
			// �Ѱ� �Ŵ���
			pstmt = con.prepareStatement(sql);
			// ?ä���
			pstmt.setString(1, dt);
			// ���� & ���ó��
			if(pstmt.executeUpdate() >= 1) {
				System.out.println("����");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		k.close();
		try {pstmt.close();} catch (SQLException e1) {e1.printStackTrace();}
		try {con.close();} catch (SQLException e) {e.printStackTrace();}
	}
}
