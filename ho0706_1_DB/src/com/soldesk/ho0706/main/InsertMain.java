package com.soldesk.ho0706.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertMain {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			String addr = "jdbc:oracle:thin:@192.168.0.100:1521:xe";
			con = DriverManager.getConnection(addr, "lp2011a", "rudgh6401");
			
			 String sql = "insert into JUL06_LOCATION_HO values(jul06_location_ho_seq.nextval, 5, 5, '�׽�Ʈ')";
			//�� ���̺� 5�� 5�� �׽�Ʈ��� ������ �߰��Ǵ� SQL
			
			pstmt = con.prepareStatement(sql); //�Ѱ��Ŵ���[sql�� ������ ���� - ���� - ��� ó�� ���ִ�] ��� ������.
			// sql�� ������ ���� - ���� - ���ó��
			// �� �� �۾� ������ ������ ���� ����޾ҳ��� ���ϵ�.
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
