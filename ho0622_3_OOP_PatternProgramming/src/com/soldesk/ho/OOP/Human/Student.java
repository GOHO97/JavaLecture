package com.soldesk.ho.OOP.Human;

public class Student {
	private int number;
	private String name;
	private String address;
	
	Student() {
		// TODO Auto-generated constructor stub
	}

	Student(int number, String name, String address) {
		super();
		this.number = number;
		this.name = name;
		this.address = address;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public void print() {
		System.out.println(number);
		System.out.println(name);
		System.out.println(address);
	}
}
