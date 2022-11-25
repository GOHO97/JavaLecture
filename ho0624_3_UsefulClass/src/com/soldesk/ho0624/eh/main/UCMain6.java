package com.soldesk.ho0624.eh.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class UCMain6 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("��������[�̸�/�������/����/�߷�] : ");
		String ar = k.next();
		System.out.println("---------------------");
		// �迭�� ����
		String[] ar2 = ar.split("/");
		// �̸� ���
		System.out.printf("�̸� : %s\n", ar2[0]);
		// ������� ���
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		try {
			Date expiration = sdf.parse(ar2[1]);
			sdf = new SimpleDateFormat("yyyy/MM/dd/E");
			String expiration2 = sdf.format(expiration);
			System.out.printf("������� : %s\n", expiration2);
			// ���� ���
			System.out.printf("���� : %s��\n", ar2[2]);
			// �߷� ���
			System.out.printf("�߷� : %sg\n", ar2[3]);
			// g�� ����
			int price = Integer.parseInt(ar2[2]);
			int weight = Integer.parseInt(ar2[3]);
			System.out.printf("g�� ���� : %.1f\n", price / (double) weight);
			// ������� ����
			Date now = new Date();
			SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMdd");
			String curYear = sdf3.format(now);
			int curYear2 = Integer.parseInt(curYear);
			sdf = new SimpleDateFormat("yyyyMMdd");
			String expiration3 = sdf.format(expiration);
			int expiration4 = Integer.parseInt(expiration3);
			if (curYear2 < expiration4) {
				System.out.println("�Ծ ��");
			}else {
				System.out.println("������ ����");
			}
			
			
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
