package com.soldesk.ho0624.eh.calculator;

public class Calculator {
	
	public static int calculate(int all, int studentCount) {
		
		try {
			all -= (15000 * studentCount);
			int ans = all / studentCount;
			return ans;
		} catch (Exception e) {
			System.out.println("�� �� �ȹٷν��");
			return -989;
		} finally {
			System.out.println("��� ��");
		}
	}
	
	public static int calculate2(int all, int studentCount) 
			throws ArithmeticException{

		all -= (15000 * studentCount);
		int ans = all / studentCount;
		return ans;
	}
	
}	
