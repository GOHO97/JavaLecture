package com.soldesk.ho.OOP.mob;


public class Monster {
	private String name;
	private int level;
	private int hp;
	private int mp;
	
	Monster() {
		// TODO Auto-generated constructor stub
	}

	Monster(String name, int level, int hp, int mp) {
		super();
		this.name = name;
		this.level = level;
		this.hp = hp;
		this.mp = mp;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}
	
	public void print () {
		System.out.println(name);
		System.out.println(level);
		System.out.println(hp);
		System.out.println(mp);
	}
}
