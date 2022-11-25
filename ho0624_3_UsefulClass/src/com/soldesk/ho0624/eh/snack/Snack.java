package com.soldesk.ho0624.eh.snack;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Snack {
	private String name;
	private Date exp;
	private int price;
	private double weight;

	public Snack() {
		// TODO Auto-generated constructor stub
	}
	
	public Snack(String data) throws ParseException{
		super();
		String[] data2 = data.split("/");
		name = data2[0];
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		exp = sdf.parse(data2[1]);
		price = Integer.parseInt(data2[2]);
		weight = Double.parseDouble(data2[3]);
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getExp() {
		return exp;
	}
	public void setExp(Date exp) {
		this.exp = exp;
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
	
	public void print() {
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd (E)");
		String exp2 = sdf2.format(exp);
		double pricePerGram = price / weight;
		Date now = new Date();
		String eatable = now.before(exp) ? "�Ծ ��" : "������";
		System.out.printf("�̸� : %s\n", name);
		System.out.printf("������� : %s\n", exp2);
		System.out.printf("���� : %d��\n", price);
		System.out.printf("�߷� : %.1fg\n", weight);
		System.out.printf("g�� ���� : %.1f��\n", pricePerGram);
		System.out.println(eatable);
	}
	
}
