package com.soldesk.ho.OOP.introduce;

public class Introduce {
	private String name;
	private int age;
	private String address;
	private String job;
	private int income;
	private String hobby;
	private static final Introduce I = new Introduce("윤경호", 26, "강서구", "학생", 0, "게임");
	
	private Introduce() {
		// TODO Auto-generated constructor stub
	}

	private Introduce(String name, int age, String address, String job, int income, String hobby) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.job = job;
		this.income = income;
		this.hobby = hobby;
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public static Introduce getI() {
		return I;
	}

	public void print() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(address);
		System.out.println(job);
		System.out.println(income);
		System.out.println(hobby);
	}
}
