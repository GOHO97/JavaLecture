package com.soldesk.ho0628.main;

public class StringCleaner {
	
	public static String clean(String s) {
		s = s.replace("<b>", "");
		s = s.replace("</b>", "");
		return s;
	}
	
}
