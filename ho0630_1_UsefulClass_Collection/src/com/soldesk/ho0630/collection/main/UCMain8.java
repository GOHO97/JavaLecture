package com.soldesk.ho0630.collection.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.soldesk.ho0630.collection.student.Student;

public class UCMain8 {
	public static void main(String[] args) {
		Student s1 = new Student("ȫ�浿", 100, 0, 10);
		Student s2 = new Student("��浿", 10, 90, 50);
		Student s3 = new Student("�̱浿", 0, 30, 15);
		
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		
		
		Scanner k = new Scanner(System.in);
		System.out.print("��ȣ : ");
		int no = k.nextInt();
		students.get(no - 1).printInfo();
	}
}
