package com.soldesk.ho.OOP.gift;

public class Meat extends Gift{
	String part;
	int weight;
	
	public Meat() {
		// TODO Auto-generated constructor stub
	}
	
	public Meat(String from, String name, String part, int weight) {
		super(from, name);
		this.part = part;
		this.weight = weight;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println(part);
		System.out.println(weight);
	}
}
