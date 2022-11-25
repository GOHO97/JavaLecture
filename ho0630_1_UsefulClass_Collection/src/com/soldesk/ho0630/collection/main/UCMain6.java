package com.soldesk.ho0630.collection.main;

import java.util.ArrayList;
import java.util.HashSet;

import com.soldesk.ho0630.collection.student.Student;

public class UCMain6 {
	public static void main(String[] args) {
		Student s1 = new Student("ȫ�浿", 100, 90, 50);
		Student s2 = new Student("ȫ�浿", 100, 90, 50);
		Student s3 = s1;
		HashSet<Student> students = new HashSet<Student>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		System.out.println(students.size());
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);		al.add(20);		al.add(321);
		al.add(10);		al.add(30);		al.add(20);
		al.add(10);		al.add(2314);	al.add(30);
		
		HashSet<Integer> hs = new HashSet<Integer>(al);
		al = new ArrayList<Integer>(hs);
		
		for (Integer i : al) {
			System.out.println(i);
		}
	}
}
