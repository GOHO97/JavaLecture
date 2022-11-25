package com.soldesk.ho.OOP.restaurant;

public class Restaurant {
	// 1. 멤버변수
	private String name;
	private String address;
	// 2. 생성자 시리즈
	public Restaurant() {
		// TODO Auto-generated constructor stub
	}

	public Restaurant(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	// 3. getter, setter[통로 시리즈]
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	// 4. 다른 메소드
	public void print() {
		System.out.println(name);
		System.out.println(address);
	}
	
}
