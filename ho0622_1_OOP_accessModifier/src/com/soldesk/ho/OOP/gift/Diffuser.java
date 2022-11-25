package com.soldesk.ho.OOP.gift;

public class Diffuser extends Gift{
	String scent;
	
	public Diffuser() {
		// TODO Auto-generated constructor stub
	}
	
	public Diffuser(String from, String name, String scent) {
		super(from, name);
		this.scent = scent;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(scent);
	}
}
