package com.soldesk.ho0630.collection.main;

import java.util.HashMap;
import java.util.Scanner;

import com.soldesk.ho0630.collection.student.Student;

public class UCMain9 {
	public static void main(String[] args) {
		Student s1 = new Student("ȫ�浿", 100, 0, 10);
		Student s2 = new Student("��浿", 10, 90, 50);
		Student s3 = new Student("�̱浿", 0, 30, 15);
		
		
		HashMap<String, Student> hm = new HashMap<String, Student>();
		hm.put("ȫ�浿", s1);
		hm.put("��浿", s2);
		hm.put("�̱浿", s3);
		
		
		Scanner k = new Scanner(System.in);
		System.out.print("�̸� : ");
		String n = k.next();
		
		hm.get(n).printInfo();
		
		
	}
}
