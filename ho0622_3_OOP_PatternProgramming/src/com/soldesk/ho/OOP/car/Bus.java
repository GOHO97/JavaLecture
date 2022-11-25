package com.soldesk.ho.OOP.car;

public class Bus extends Car{
	
	Bus() {
		// TODO Auto-generated constructor stub
	}

	Bus(int num) {
		super(num);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void print() {
		System.out.print("¹ö½º : ");
		super.print();
	}
}
