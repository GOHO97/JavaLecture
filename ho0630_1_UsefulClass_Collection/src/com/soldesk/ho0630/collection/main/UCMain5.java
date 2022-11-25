package com.soldesk.ho0630.collection.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Random;

public class UCMain5 {
	public static void main(String[] args) {
		Random r = new Random();
		HashSet<Integer> hs = new HashSet<Integer>();
		
		while (true) {
			hs.add(r.nextInt(45) + 1);
			if (hs.size() == 6) {
				break;
			}
		}
		
	
		ArrayList<Integer> al = new ArrayList<Integer>(hs);
		al.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});
		for (Integer i : al) {
			System.out.println(i);
		}
	}
}
