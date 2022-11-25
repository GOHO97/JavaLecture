package com.soldesk.ho.OOP.hero;

public class IronMan extends Hero{
	private String property;
	
	public IronMan() {
		// TODO Auto-generated constructor stub
	}

	public IronMan(String name, int age, String property) {
		super(name, age);
		this.property = property;
	}

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println(property);
	}
}
