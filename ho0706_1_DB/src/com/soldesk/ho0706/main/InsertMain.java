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
			
			 String sql = "insert into JUL06_LOCATION_HO values(jul06_location_ho_seq.nextval, 5, 5, '테스트')";
			//층 테이블에 5관 5층 테스트라는 데이터 추가되는 SQL
			
			pstmt = con.prepareStatement(sql); //총괄매니저[sql을 서버로 전송 - 실행 - 결과 처리 해주는] 사람 데려옴.
			// sql을 서버로 전송 - 실행 - 결과처리
			// 후 그 작업 때문에 데이터 몇줄 영향받았나가 리턴됨.
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
