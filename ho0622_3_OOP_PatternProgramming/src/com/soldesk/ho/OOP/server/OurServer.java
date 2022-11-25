package com.soldesk.ho.OOP.server;

public class OurServer {
	private String address;
	private int price;
	private double weight;
	private static final OurServer OS = new OurServer("gang-soldesk-nam.tplinkdns.com", 0, 20);
	
	private OurServer() {
		// TODO Auto-generated constructor stub
	}
	
	private OurServer(String address, int price, double weight) {
		super();
		this.address = address;
		this.price = price;
		this.weight = weight;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public static OurServer getOs() {
		return OS;
	}

	public void print() {
		System.out.println(address);
		System.out.println(price);
		System.out.println(weight);
	}
}
