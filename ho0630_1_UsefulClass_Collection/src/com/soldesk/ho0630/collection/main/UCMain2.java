package com.soldesk.ho0630.collection.main;

import java.util.ArrayList;
import java.util.Comparator;

import com.soldesk.ho0630.collection.student.Student;

public class UCMain2 {
	public static void main(String[] args) {
		Student s1 = new Student("ȫ�浿", 100, 50, 87);
		Student s2 = new Student("��浿", 90, 76, 64);
		Student s3 = new Student("�̱浿", 32, 97, 55);
		Student s4 = new Student("�ֱ浿", 86, 83, 92);
		Student s5 = new Student("�ڱ浿", 83, 97, 77);
		
		
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		
		// �ι�° �л� ���� ����
		System.out.println(students.get(1).getMeth());
		// ����° �л� ��ü ����
		students.get(2).printInfo();
		// ��ü �л� ����
		for (int i = 0; i < students.size(); i++) {
			students.get(i).printInfo();
			System.out.println("------");
		}
		// �л� ���
		System.out.println(students.size());
		System.out.println("------");
		// �������� ���
		int a = 0;
		for (int i = 0; i < students.size(); i++) {
			a += students.get(i).getKor();
		}
		System.out.println(a / (double) students.size());
		System.out.println("-----");
		
		// �̸� �����ټ� ����
		students.sort(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				String n1 = o1.getName();
				String n2 = o2.getName();
				return n1.compareTo(n2);
			}
		});
		
		for (Student student : students) {
			student.printInfo();
		}
		
		//1�� �л� ����
		
		students.sort(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				Integer s1 = o1.getKor() + o1.getEng() + o1.getMeth();
				Integer s2 = o2.getKor() + o2.getEng() + o2.getMeth();
				return s2.compareTo(s1);
			}
		});
		
		students.get(0).printInfo();
		
		// �õ��л� ����
		students.get(students.size() - 1).printInfo();
	}
}
