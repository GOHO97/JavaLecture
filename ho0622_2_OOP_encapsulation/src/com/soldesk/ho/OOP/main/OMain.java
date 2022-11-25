package com.soldesk.ho.OOP.main;

import java.util.Scanner;

import com.soldesk.ho.OOP.human.Human;

public class OMain {
	public static void main(String[] args) {
		Human h = new Human("홍길동", 20);
		h.print();
		System.out.println("-----");
		
		Scanner change = new Scanner(System.in);
		System.out.print("수정할 나이 입력 : ");
		int a = change.nextInt();
		h.setAge(a);
		h.print();
	}
}
