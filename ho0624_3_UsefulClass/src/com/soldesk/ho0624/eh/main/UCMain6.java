package com.soldesk.ho0624.eh.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class UCMain6 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("과자정보[이름/유통기한/가격/중량] : ");
		String ar = k.next();
		System.out.println("---------------------");
		// 배열로 만듬
		String[] ar2 = ar.split("/");
		// 이름 출력
		System.out.printf("이름 : %s\n", ar2[0]);
		// 유통기한 출력
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		try {
			Date expiration = sdf.parse(ar2[1]);
			sdf = new SimpleDateFormat("yyyy/MM/dd/E");
			String expiration2 = sdf.format(expiration);
			System.out.printf("유통기한 : %s\n", expiration2);
			// 가격 출력
			System.out.printf("가격 : %s원\n", ar2[2]);
			// 중량 출력
			System.out.printf("중량 : %sg\n", ar2[3]);
			// g당 가격
			int price = Integer.parseInt(ar2[2]);
			int weight = Integer.parseInt(ar2[3]);
			System.out.printf("g당 가격 : %.1f\n", price / (double) weight);
			// 유통기한 판정
			Date now = new Date();
			SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMdd");
			String curYear = sdf3.format(now);
			int curYear2 = Integer.parseInt(curYear);
			sdf = new SimpleDateFormat("yyyyMMdd");
			String expiration3 = sdf.format(expiration);
			int expiration4 = Integer.parseInt(expiration3);
			if (curYear2 < expiration4) {
				System.out.println("먹어도 됨");
			}else {
				System.out.println("먹으면 죽음");
			}
			
			
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
