package com.soldesk.ho.db.manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HoDBManager {
	// 주소, 아이디, 비번 넣어서 부르면 연결해주는
	public static Connection hi(String addr, String id, String pw) throws SQLException{
		return DriverManager.getConnection(addr, id, pw);
	}
	// 연결, 총괄매니저, ResultSet 넣어 부르면 다 닫아주는
	public static void bye(Connection con, PreparedStatement pstmt, ResultSet rs) {
		// select 때는 상관 없지만 CUD때는 rs가 없음 => NullPointerException 무조건 뜸
		try {
			rs.close();
		} catch (Exception e) { //NullPointerException도 잡겠다는 뜻
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
