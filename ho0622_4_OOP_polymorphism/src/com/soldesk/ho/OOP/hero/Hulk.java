package com.soldesk.ho.OOP.hero;

public class Hulk extends Hero{
	private int pantsSize;
	
	public Hulk() {
		// TODO Auto-generated constructor stub
	}

	public Hulk(String name, int age, int pantsSize) {
		super(name, age);
		this.pantsSize = pantsSize;
	}

	public int getPantsSize() {
		return pantsSize;
	}

	public void setPantsSize(int pantsSize) {
		this.pantsSize = pantsSize;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println(pantsSize);
	}
}
