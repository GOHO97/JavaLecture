package com.soldesk.ho.OOP.gift;

public class Gift {
	String from;
	String name;
	
	public Gift() {
		// TODO Auto-generated constructor stub
	}

	public Gift(String from, String name) {
		super();
		this.from = from;
		this.name = name;
	}
	
	public void print() {
		System.out.println(from);
		System.out.println(name);
	}
}
