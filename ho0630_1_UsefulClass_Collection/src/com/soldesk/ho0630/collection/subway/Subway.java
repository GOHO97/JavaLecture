package com.soldesk.ho0630.collection.subway;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Subway {
	private Date when;
	private String lineNum;
	private String station;
	private double rider;
	private double unrider;
	
	public Subway() {
		// TODO Auto-generated constructor stub
	}
	
	public Subway(String line) throws ParseException {
		String[] data = line.split(",");
		String when2 = String.format("%s%s%s", data[0], data[1], data[2]);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		when = sdf.parse(when2);
		lineNum = data[3];
		station = data[4];
		rider = Double.parseDouble(data[5]);
		unrider = Double.parseDouble(data[6]);
	}	
	public Date getWhen() {
		return when;
	}
	public void setWhen(Date when) {
		this.when = when;
	}
	public String getLineNum() {
		return lineNum;
	}
	public void setLineNum(String lineNum) {
		this.lineNum = lineNum;
	}
	public String getStation() {
		return station;
	}
	public void setStation(String station) {
		this.station = station;
	}
	public double getRider() {
		return rider;
	}
	public void setRider(double rider) {
		this.rider = rider;
	}
	public double getUnrider() {
		return unrider;
	}
	public void setUnrider(double unrider) {
		this.unrider = unrider;
	}

	public void print() {
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy�� MM�� dd�� (E)");
		String when3 = sdf2.format(when);
		System.out.printf("��¥ : %s\r\n", when3);
		System.out.printf("ȣ�� ���� : %s\r\n", lineNum);
		System.out.printf("������ : %s\r\n", station);
		System.out.printf("ž�°� : %.0f��\r\n", rider);
		System.out.printf("������ : %.0f��\r\n", unrider);
		System.out.println("----------------------");
	}
	
}
