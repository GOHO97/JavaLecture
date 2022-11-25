package com.soldesk.ho.OOP.human;

public class Human {
	private String name;
	private int age;
	
	public void setAge(int a) {
		if (a < 0) {
			a *= -1;
		}
		age = a;
	}
	
	public Human() {
		// TODO Auto-generated constructor stub
	}

	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void print() {
		System.out.println(name);
		System.out.println(age);
	}
}
