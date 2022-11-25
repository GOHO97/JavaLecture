package com.soldesk.ho.OOP.Human;

public class Soldesk {
	
	private int studentCount;
	
	public Student talk(String name, String home) {
		studentCount++;
		Student s = new Student(studentCount, name, home);
		return s;
	}
}
