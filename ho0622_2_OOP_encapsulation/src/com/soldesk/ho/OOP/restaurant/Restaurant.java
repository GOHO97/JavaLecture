package com.soldesk.ho.OOP.restaurant;

public class Restaurant {
	// 1. �������
	private String name;
	private String address;
	// 2. ������ �ø���
	public Restaurant() {
		// TODO Auto-generated constructor stub
	}

	public Restaurant(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	// 3. getter, setter[��� �ø���]
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
	// 4. �ٸ� �޼ҵ�
	public void print() {
		System.out.println(name);
		System.out.println(address);
	}
	
}
