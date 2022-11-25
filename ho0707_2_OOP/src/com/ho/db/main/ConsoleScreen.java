package com.ho.db.main;

import java.util.Scanner;

public class ConsoleScreen {
	private Scanner strow;
	
	public ConsoleScreen() {
		strow = new Scanner(System.in);
	}
	
	public Consolevalue getvalue() {
		System.out.print("�� : ");
		int l_hall = strow.nextInt();
		System.out.print("�� : ");
		int l_floor = strow.nextInt();
		System.out.print("�� : ");
		String what = strow.next();
		
		return new Consolevalue(l_hall, l_floor, what);
	}
	
	public void closeS() {
		strow.close();
	}
	
	public void print(String r) {
		System.out.println(r);
	}
}
