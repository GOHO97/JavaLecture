package com.soldesk.ho0630.collection.split;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Split {
	private Date when;
	private String weatger;
	private double temp;
	private int humidity;
	
	
	public Split() {
		// TODO Auto-generated constructor stub
	}
	public Split(String line) throws ParseException{
		String[] data = line.split(",");
		String when2 = String.format("%s%s%s%s", data[0], data[1], data[2], data[3]);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHH");
		when = sdf.parse(when2);
		weatger = data[4];
		temp = Double.parseDouble(data[5]);
		humidity = Integer.parseInt(data[6]);
		
	}
	
	
	


	
	public Date getWhen() {
		return when;
	}
	public void setWhen(Date when) {
		this.when = when;
	}
	public String getWeatger() {
		return weatger;
	}
	public void setWeatger(String weatger) {
		this.weatger = weatger;
	}
	public double getTemp() {
		return temp;
	}
	public void setTemp(double temp) {
		this.temp = temp;
	}
	public int getHumidity() {
		return humidity;
	}
	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}
	
	public void show() {
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd(E) aa hh시");
		System.out.printf("날짜 : %s\n", sdf2.format(when));
		System.out.printf("날씨 : %s\n", weatger);
		System.out.printf("온도 : %.1f\n", temp);
		System.out.printf("습도 : %01d\n", humidity);
		System.out.println("----------");
	}
}
