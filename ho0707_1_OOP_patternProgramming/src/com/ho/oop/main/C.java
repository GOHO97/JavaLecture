package com.ho.oop.main;
//Controller[������ ������]
// ��Ȳ�Ǵ��ؼ�, M�� �ʿ��ϸ� M �θ��� V �ʿ��ϸ� V �θ���
// ���α׷� ������
public class C {
	public static void main(String[] args) {
		V v = new V();
		XY xy = v.getXY();
		CalcResult cr = M.calculate(xy);
		v.print(cr);
		v.bye();
	}
}
