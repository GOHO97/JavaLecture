package com.soldesk.ho.OOP.main;

import com.soldesk.ho.OOP.hero.Hero;
import com.soldesk.ho.OOP.hero.Hulk;
import com.soldesk.ho.OOP.hero.Human;
import com.soldesk.ho.OOP.hero.IronMan;

public class OMain {
	public static void main(String[] args) {
		IronMan i = new IronMan("���", 40, "100��");
		i.print();
		System.out.println("----");

		Hulk h = new Hulk("���", 30, 40);
		h.print();
		System.out.println("----");
		
		Hero d = new IronMan();
		d.print();
		
		Hero[] ar = {i, h};
		for (Hero a : ar) {
			a.print();
		}
		
		Human hh = new Human();
		hh.helpMe(h);
	}
}
