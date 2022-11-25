package com.soldesk.ho.OOP.main;

import com.soldesk.ho.OOP.restaurant.Ramen;
import com.soldesk.ho.OOP.restaurant.Restaurant;

public class OMain2 {
	public static void main(String[] args) {
		Restaurant r = new Restaurant("난바우동", "신논현역");
		r.setAddress("계단 내려가서 왼쪽으로 쭉");
		System.out.println(r.getName());
		
		Ramen m = new Ramen("멘야산다이메", "신논현역", 100, false);
		m.setAddress("계단 내려가서 오른쪽으로 쭉");
//		System.out.println(m.getFigure());
//		System.out.println(m.isEmpty());
		m.print();
		
		
	}
}
