package com.soldesk.ho0630.collection.main;

import java.util.ArrayList;
import java.util.Comparator;

import javax.swing.JButton;

public class UCMain {
	public static void main(String[] args) {
		int[][] score = {{100, 90, 30},{10, 20, 30},{40, 50, 60}}; 
		System.out.println(score[0][2]);
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add("ㅋ");
		al.add(new JButton());
		
		System.out.println(al.get(0));
		System.out.println(al.size());
		System.out.println("-----");
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		
		int a = 10;
		Integer aa = new Integer(a);
		al2.add(aa);
		al2.add(20);
		al2.add(120);
		al2.add(54);
		al2.add(7);
		al2.add(2, 100);
		al2.add(2, 50);
		
		for (int i = 0; i < al2.size(); i++) {
			System.out.println(al2.get(i));
		}
		
		System.out.println("------");
		
		al2.remove(1);
		al2.set(0, 999);
		
		Comparator<Integer> c = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2); //오름차순
			//	return o2.compareTo(o1); //내림차순
			}
		};
		al2.sort(c);
		
		for (Integer ii : al2) {
			System.out.println(ii);
		}
		
		
	}
}
