package com.soldesk.ho0624.eh.main;

import java.util.Scanner;

public class EHMain {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		String[] where = {"����", "�ڽ���"};
		System.out.println("��� : ");
		int w = k.nextInt();
		
		System.out.print("�� �� : ");
		int total = k.nextInt();
		System.out.print("���� �ο��� : ");
		int people = k.nextInt();
		int support = 15000;
		System.out.printf("%d��\n", support);
		System.out.println("------");
		
//		try {
//			System.out.println(where[w]);
//			int fee = total / people - support;
//			System.out.printf("1�δ� ȸ�� : %d��\n", fee);
//		} catch (ArithmeticException e) {
//			System.out.println("������ 0�� ����.");
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("�Ĵ� �ĺ����� 2��");
//		}
		
		try {
			System.out.println(where[w]);
			int fee = total / people - support;
			System.out.printf("1�δ� ȸ�� : %d��\n", fee);
		} catch (Exception e) {
			System.out.println("��");
			e.printStackTrace();// exception ��Ȳ ��� : �����ڿ�
								// ������ ���� ���ٰ�
								// ���� ����� ���� ����
		} finally {
			System.out.println("��� ��");
		}
		
	}
}
