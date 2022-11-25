package com.soldesk.ho0624.eh.calculator;

public class Calculator {
	
	public static int calculate(int all, int studentCount) {
		
		try {
			all -= (15000 * studentCount);
			int ans = all / studentCount;
			return ans;
		} catch (Exception e) {
			System.out.println("아 쫌 똑바로써요");
			return -989;
		} finally {
			System.out.println("계산 끝");
		}
	}
	
	public static int calculate2(int all, int studentCount) 
			throws ArithmeticException{

		all -= (15000 * studentCount);
		int ans = all / studentCount;
		return ans;
	}
	
}	
