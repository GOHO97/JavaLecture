package com.soldesk.ho.OOP.main;

import com.soldesk.ho.OOP.mob.Monster;
import com.soldesk.ho.OOP.mob.mobfactory;

public class OMain4 {
	public static void main(String[] args) {
		mobfactory m = new mobfactory();
		Monster m1 = m.summon("������");
		m1.print();
		Monster m2 = m.summon("ū������");
		m2.print();
		
		
				
	}
}
