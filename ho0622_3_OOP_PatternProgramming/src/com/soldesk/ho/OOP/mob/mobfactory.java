package com.soldesk.ho.OOP.mob;

import java.util.Random;

public class mobfactory {
	private Random brain;
	
	public mobfactory() {
		brain = new Random();
	}
	
	public Monster summon(String name) {
		int level = brain.nextInt(10) + 1;
		int hp = brain.nextInt(401) + 100;
		int mp = brain.nextInt(101);
		return new Monster(name, level, hp, mp);
	}
}
