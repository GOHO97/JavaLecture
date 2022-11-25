package com.soldesk.ho.OOP.main;

import com.soldesk.ho.OOP.gift.Diffuser;
import com.soldesk.ho.OOP.gift.Meat;

public class GMain {
	public static void main(String[] args) {
		Meat m = new Meat("종로에 있는 강사", "부드랩플러스고기", "부채살", 700);
		m.print();
		System.out.println("-----");
		
		Diffuser d = new Diffuser("강사 지망생1", "코코도르 디퓨저", "리프레싱에어");
		d.print();
		System.out.println("-----");
		
		d.from = "잘모르는사람";
	}
}
