package com.soldesk.ho.OOP.car;

public class Sedan extends Car{
	
	Sedan() {
		// TODO Auto-generated constructor stub
	}

	Sedan(int num) {
		super(num);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void print() {
		System.out.print("¼¼´Ü : ");
		super.print();
	}
}
