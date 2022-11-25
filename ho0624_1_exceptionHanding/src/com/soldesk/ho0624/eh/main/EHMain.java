package com.soldesk.ho0624.eh.main;

import java.util.Scanner;

public class EHMain {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		String[] where = {"원만", "코스모"};
		System.out.println("어디 : ");
		int w = k.nextInt();
		
		System.out.print("총 얼마 : ");
		int total = k.nextInt();
		System.out.print("참여 인원수 : ");
		int people = k.nextInt();
		int support = 15000;
		System.out.printf("%d원\n", support);
		System.out.println("------");
		
//		try {
//			System.out.println(where[w]);
//			int fee = total / people - support;
//			System.out.printf("1인당 회비 : %d원\n", fee);
//		} catch (ArithmeticException e) {
//			System.out.println("나누기 0은 없다.");
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("식당 후보군은 2개");
//		}
		
		try {
			System.out.println(where[w]);
			int fee = total / people - support;
			System.out.printf("1인당 회비 : %d원\n", fee);
		} catch (Exception e) {
			System.out.println("쫌");
			e.printStackTrace();// exception 상황 출력 : 개발자용
								// 개발할 때는 쓰다가
								// 최종 출시할 때는 삭제
		} finally {
			System.out.println("계산 끝");
		}
		
	}
}
