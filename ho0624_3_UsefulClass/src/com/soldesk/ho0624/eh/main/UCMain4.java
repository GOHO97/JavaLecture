package com.soldesk.ho0624.eh.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//날짜
public class UCMain4 {
	public static void main(String[] args) {
		//현재시간날짜
		Date now = new Date();
		System.out.println(now);
		
		//연도만
		System.out.println(now.getYear());
		//월만
		System.out.println(now.getMonth());
		//일만
		System.out.println(now.getDay());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MM E h s");
		// Date -> String
		String now2 = sdf.format(now);
		System.out.println(now2);
		
		//특정시간날짜
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
