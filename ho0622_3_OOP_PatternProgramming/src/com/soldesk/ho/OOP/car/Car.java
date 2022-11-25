package com.soldesk.ho.OOP.car;

public class Car {
	private int num;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(int num) {
		super();
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public void print() {
		System.out.println(num);
	}
}
