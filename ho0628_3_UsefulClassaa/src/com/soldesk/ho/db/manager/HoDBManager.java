package com.soldesk.ho.db.manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HoDBManager {
	// �ּ�, ���̵�, ��� �־ �θ��� �������ִ�
	public static Connection hi(String addr, String id, String pw) throws SQLException{
		return DriverManager.getConnection(addr, id, pw);
	}
	// ����, �Ѱ��Ŵ���, ResultSet �־� �θ��� �� �ݾ��ִ�
	public static void bye(Connection con, PreparedStatement pstmt, ResultSet rs) {
		// select ���� ��� ������ CUD���� rs�� ���� => NullPointerException ������ ��
		try {
			rs.close();
		} catch (Exception e) { //NullPointerException�� ��ڴٴ� ��
		}
		try {
			pstmt.close();
		} catch (Exception e) {
		}
		try {
			con.close();
		} catch (Exception e) {
		}
	}
	
}
