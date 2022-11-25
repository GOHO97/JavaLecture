package com.soldesk.ho0624.eh.main;

import java.util.Scanner;

public class UCMain3 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("∏‘¿∫ ∞≈ ∞°∞›: ");
		String s = k.next();
		System.out.println("----");
		String[] ss = s.split("/");
		int a = 0;

		for (int i = 0; i < ss.length; i++) {
			try {
				a += Integer.parseInt(ss[i]);

			} catch (Exception e) {

			}
		}
		System.out.println(a);
	}
}