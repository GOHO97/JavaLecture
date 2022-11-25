package com.soldesk.ho.OOP.main;

import com.soldesk.ho.OOP.mob.Monster;
import com.soldesk.ho.OOP.mob.mobfactory;

public class OMain4 {
	public static void main(String[] args) {
		mobfactory m = new mobfactory();
		Monster m1 = m.summon("슬라임");
		m1.print();
		Monster m2 = m.summon("큰슬라임");
		m2.print();
		
		
				
	}
}
