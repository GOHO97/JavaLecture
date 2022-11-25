package com.soldesk.ho0706.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;

public class ConnectMain {
	public static void main(String[] args) {
		Connection con = null;
		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String addr = "jdbc:oracle:thin:@192.168.0.100:1521:xe";
			
			 con = DriverManager.getConnection(addr, "lp2011a", "rudgh6401");
			
			System.out.println("¼º°ø");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
