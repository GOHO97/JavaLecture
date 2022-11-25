package com.ho.oop.main;

// 따지자면 M 쪽
//JavaBean
//DTO(Data Transfer/Temp object)
public class XY {
	private int x;
	private int y;
	
	public XY() {
		// TODO Auto-generated constructor stub
	}

	public XY(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
}
