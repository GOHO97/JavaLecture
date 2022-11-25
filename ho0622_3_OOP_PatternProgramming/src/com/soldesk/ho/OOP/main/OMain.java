package com.soldesk.ho.OOP.main;

import com.soldesk.ho.OOP.introduce.Introduce;

public class OMain {
	public static void main(String[] args) {
		Introduce ygh = Introduce.getI();
		ygh.setAddress("ȭ�");
		System.out.println(ygh);
		ygh.print();
	}
}
