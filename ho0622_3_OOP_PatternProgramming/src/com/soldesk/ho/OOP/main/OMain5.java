package com.soldesk.ho.OOP.main;

import com.soldesk.ho.OOP.car.Car;
import com.soldesk.ho.OOP.car.CarFactory;

public class OMain5 {
	public static void main(String[] args) {
		CarFactory f = new CarFactory();
		Car c1 = f.makeCar("����");
		c1.print();
		Car c2 = f.makeCar("Ʈ��");
		c2.print();
		Car c3 = f.makeCar("����");
		c3.print();
	}
}
