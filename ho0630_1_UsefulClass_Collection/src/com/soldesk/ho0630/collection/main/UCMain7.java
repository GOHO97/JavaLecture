package com.soldesk.ho0630.collection.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class UCMain7 {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		hm.put("Ű����", 10000);
		hm.put("���콺", 5000);
		hm.put("Ű����", 32000);
		
		System.out.println(hm.get("Ű����"));
		Set<String> keys = hm.keySet();
		ArrayList<String> keys2 = new ArrayList<String>(keys);
		for (String k : keys2) {
			System.out.println(k);
			System.out.println(hm.get(k));
			System.out.println("-----");
		}
	}
}
