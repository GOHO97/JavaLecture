package com.soldesk.ho.OOP.main;

import com.soldesk.ho.OOP.restaurant.Ramen;
import com.soldesk.ho.OOP.restaurant.Restaurant;

public class OMain2 {
	public static void main(String[] args) {
		Restaurant r = new Restaurant("���ٿ쵿", "�ų�����");
		r.setAddress("��� �������� �������� ��");
		System.out.println(r.getName());
		
		Ramen m = new Ramen("��߻���̸�", "�ų�����", 100, false);
		m.setAddress("��� �������� ���������� ��");
//		System.out.println(m.getFigure());
//		System.out.println(m.isEmpty());
		m.print();
		
		
	}
}
