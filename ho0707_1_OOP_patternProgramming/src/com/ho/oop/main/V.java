package com.ho.oop.main;
import java.util.Scanner;

//View[�����̳�] = ������ ����ڿ��� �������� ����[�Է�/���]
// �ܼ�â -> �ڹ�???
// �� -> �����̳ʰ� ���� �۾� ����

public class V { // �ܼ�â
	//�ܼ�â�� �پ��ִ�
	//�ű� �ִ� ������ ���α׷����� �����ö� ���� ����
	//�� ������
	private Scanner strawSupporter; 
	
	public V() {
		strawSupporter = new Scanner(System.in);
	}
	
	public XY getXY() {
		System.out.print("x : ");
		int x = strawSupporter.nextInt();
		
		System.out.print("y : ");
		int y = strawSupporter.nextInt();
		
		return new XY(x, y); 
	}
	
	public void print(CalcResult cr) {
		System.out.println(cr.getA());
		System.out.println(cr.getB());
		System.out.println(cr.getC());
		System.out.println(cr.getD());
	}
	
	public void bye() {
		strawSupporter.close();
	}
}
