package com.soldesk.ho.OOP.main;

import java.util.Scanner;

import com.soldesk.ho.OOP.human.Human;

public class OMain {
	public static void main(String[] args) {
		Human h = new Human("ȫ�浿", 20);
		h.print();
		System.out.println("-----");
		
		Scanner change = new Scanner(System.in);
		System.out.print("������ ���� �Է� : ");
		int a = change.nextInt();
		h.setAge(a);
		h.print();
	}
}
