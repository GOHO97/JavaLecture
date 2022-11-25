package com.soldesk.ho0630.collection.main;

import java.util.HashMap;
import java.util.Scanner;

import com.soldesk.ho0630.collection.student.Student;

public class UCMain9 {
	public static void main(String[] args) {
		Student s1 = new Student("홍길동", 100, 0, 10);
		Student s2 = new Student("김길동", 10, 90, 50);
		Student s3 = new Student("이길동", 0, 30, 15);
		
		
		HashMap<String, Student> hm = new HashMap<String, Student>();
		hm.put("홍길동", s1);
		hm.put("김길동", s2);
		hm.put("이길동", s3);
		
		
		Scanner k = new Scanner(System.in);
		System.out.print("이름 : ");
		String n = k.next();
		
		hm.get(n).printInfo();
		
		
	}
}
