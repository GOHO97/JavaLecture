package com.ho.oop.main;

//Model[������ + ��] - ����Ͻ� ����[���� ���]
public class M {
	public static CalcResult calculate(XY xy) {
		int a = xy.getX() + xy.getY();
		int b = xy.getX() - xy.getY();
		int c = xy.getX() * xy.getY();
		int d = xy.getX() / xy.getY();
		
		return new CalcResult(a, b, c, d);
	}
}
