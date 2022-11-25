package com.soldesk.ho.OOP.car;

public class CarFactory {
	
	private int carCount;
	
	public Car makeCar(String kind) {
		carCount++;
		if(kind.equals("세단")) {
			return new Sedan(carCount);
		} else if(kind.equals("트럭")) {
			return new Truck(carCount);
		} else
		return new Bus(carCount);
		
	}
}
