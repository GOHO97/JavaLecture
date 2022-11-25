package com.ho.db.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.soldesk.ho.db.manager.HoDBManager;

public class MarioOutletDAO {
	
	public static String regFloor(Consolevalue cv) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			String addr = "jdbc:oracle:thin:@192.168.0.100:1521:xe";
			con = HoDBManager.hi(addr, "lp2011a", "rudgh6401");
			String sql = "insert into JUL06_LOCATION_HO values"
					+ "(JUL06_Location_HO_seq.nextval, ?, ?, ? )";
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, cv.getL_hall());
			pstmt.setInt(2, cv.getL_floor());
			pstmt.setString(3, cv.getWhat());
			
			if(pstmt.executeUpdate() >= 1) {
				return "������(����)";
			} else {
				return "����";
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "����(��_��)";
		} finally {
			HoDBManager.bye(con, pstmt, null);
		}
	}
	
	public static String selectFloor() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String addr = "jdbc:oracle:thin:@192.168.0.100:1521:xe";
			con = HoDBManager.hi(addr, "lp2011a", "rudgh6401");
			String sql = "select l_hall, l_floor, s_name"
					+ " from jul06_location_ho, jul06_shop_ho"
					+ " where l_no = s_locationNum"
					+ " order by l_hall, l_floor";
			
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			//���� ������ ���ڿ� ��ü
			StringBuffer sb = new StringBuffer();
			
			String s = "";
			
			while(rs.next()) {
				s = String.format("%d��, %d��, %s\r\n", rs.getInt("l_hall"), rs.getInt("l_floor"), rs.getString("s_name"));
				sb.append(s);
			}
			
			return sb.toString();
			
		} catch (Exception e) {
			return "����� �� �ϳ�?";
		} finally {
			HoDBManager.bye(con, pstmt, rs);
		}
	}
}
