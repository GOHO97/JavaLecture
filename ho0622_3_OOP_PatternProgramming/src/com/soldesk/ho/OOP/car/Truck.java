package com.soldesk.ho.OOP.car;

public class Truck extends Car{
	
	Truck() {
		// TODO Auto-generated constructor stub
	}

	Truck(int num) {
		super(num);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void print() {
		System.out.print("Æ®·° : ");
		super.print();
	}
}
