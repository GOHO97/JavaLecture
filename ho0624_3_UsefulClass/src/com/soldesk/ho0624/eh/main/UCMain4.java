package com.soldesk.ho0624.eh.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//��¥
public class UCMain4 {
	public static void main(String[] args) {
		//����ð���¥
		Date now = new Date();
		System.out.println(now);
		
		//������
		System.out.println(now.getYear());
		//����
		System.out.println(now.getMonth());
		//�ϸ�
		System.out.println(now.getDay());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MM E h s");
		// Date -> String
		String now2 = sdf.format(now);
		System.out.println(now2);
		
		//Ư���ð���¥
		//Date nextFriday = new Date(2022, 7, 1);
		String nextFriday = "2022-07-01";
		// String -> Date
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date nextFriday2 = sdf2.parse(nextFriday);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
}
