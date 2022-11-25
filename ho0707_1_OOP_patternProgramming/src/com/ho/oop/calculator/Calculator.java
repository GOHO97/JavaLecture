package com.ho.oop.calculator;

import java.util.Scanner;

public class Calculator {
	 private Scanner input = null;
	
	public int input() {
		input = new Scanner(System.in);
		System.out.print("¼ıÀÚ : ");
		int a = input.nextInt();
		return a;
	}
	
	public static void hab(int a, int b) {
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / (double) b);
	}
}
