package com.soldesk.ho.OOP.car;

public class CarFactory {
	
	private int carCount;
	
	public Car makeCar(String kind) {
		carCount++;
		if(kind.equals("����")) {
			return new Sedan(carCount);
		} else if(kind.equals("Ʈ��")) {
			return new Truck(carCount);
		} else
		return new Bus(carCount);
		
	}
}
