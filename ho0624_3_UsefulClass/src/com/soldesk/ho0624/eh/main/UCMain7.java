package com.soldesk.ho0624.eh.main;

import java.text.ParseException;
import java.util.Scanner;

import com.soldesk.ho0624.eh.snack.Snack;

public class UCMain7 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("��������[�̸�/�������/����/�߷�] : ");
		String data = k.next();
		System.out.println("---------------------");
		
		try {
			Snack s = new Snack(data);
			s.print();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
