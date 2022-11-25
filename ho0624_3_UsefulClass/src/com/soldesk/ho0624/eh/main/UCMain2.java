package com.soldesk.ho0624.eh.main;

public class UCMain2 {
	public static void main(String[] args) {
		int a = 10;
		//기본형 -> 객체형
		Integer aa = new Integer(a);
		//다시 객체형 -> 기본형
		int aaa = aa.intValue();
		
		boolean b = true;
		Boolean bb = new Boolean(b);
		boolean bbb = bb.booleanValue();
		
		double c = 1.2;
		Double cc = c; // 기본형 -> 객체형
		double ccc = cc; // 객체형 -> 기본형
		
		System.out.println("----");
		
		String d = "10";
		// String -> Integer
		int dd = Integer.parseInt(d);
		// Integer -> int
		System.out.println(dd + 20);
		
		String e = "2.33";
		double ee = Double.parseDouble(e);
		System.out.println(ee + 1);
		
		int f = 5;
		String ff = 5 + "";
		System.out.println(ff + 5);
		
		double g = 213.1;
		String gg = String.format("%f", g);
		System.out.println(gg + 0.3);
		
	}
}
