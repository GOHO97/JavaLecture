package com.ho.oop.main;
//Controller[리더급 개발자]
// 상황판단해서, M이 필요하면 M 부르고 V 필요하면 V 부르는
// 프로그램 시작점
public class C {
	public static void main(String[] args) {
		V v = new V();
		XY xy = v.getXY();
		CalcResult cr = M.calculate(xy);
		v.print(cr);
		v.bye();
	}
}
