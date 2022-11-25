package com.soldesk.ho0624.eh.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UCMain5 {
	public static void main(String[] args) {
		//본인이 무슨요일에 태어났나
		String birthday = "1997-07-20";
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date birthday2 = sd.parse(birthday);
			sd = new SimpleDateFormat("E");
			String birthday3 = sd.format(birthday2);
			System.out.println(birthday3);
			
			Date now = new Date();
			SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy");
			String curYear = sdf3.format(now);
			int curYear2 = Integer.parseInt(curYear);
			
			String birthYear = sdf3.format(birthday2);
			int birthYear2 = Integer.parseInt(birthYear);
			System.out.println(curYear2 - birthYear2 + 1);
			
		} catch (ParseException e) {
			e.printStackTrace();
		} 
		
		
	}
}
