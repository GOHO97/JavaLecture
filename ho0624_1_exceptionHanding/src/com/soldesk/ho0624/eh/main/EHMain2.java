package com.soldesk.ho0624.eh.main;

import java.util.Scanner;
import com.soldesk.ho0624.eh.calculator.Calculator;

public class EHMain2 {
	
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("�� �� : ");
		int total = k.nextInt();
		System.out.print("���� �ο��� : ");
		int people = k.nextInt();
		
		System.out.println(Calculator.calculate(total, people)); 
		
		System.out.println("-----");
		try {
			Calculator.calculate2(total, people);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
