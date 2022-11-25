package com.soldesk.ho.OOP.main;

import com.soldesk.ho.OOP.car.Car;
import com.soldesk.ho.OOP.car.CarFactory;

public class OMain5 {
	public static void main(String[] args) {
		CarFactory f = new CarFactory();
		Car c1 = f.makeCar("세단");
		c1.print();
		Car c2 = f.makeCar("트럭");
		c2.print();
		Car c3 = f.makeCar("버스");
		c3.print();
	}
}
