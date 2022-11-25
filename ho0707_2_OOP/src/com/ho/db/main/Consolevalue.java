package com.ho.db.main;

public class Consolevalue {
	private int l_hall;
	private int l_floor;
	private String what;
	
	public Consolevalue() {
		// TODO Auto-generated constructor stub
	}

	public Consolevalue(int l_hall, int l_floor, String what) {
		super();
		this.l_hall = l_hall;
		this.l_floor = l_floor;
		this.what = what;
	}

	public int getL_hall() {
		return l_hall;
	}

	public void setL_hall(int l_hall) {
		this.l_hall = l_hall;
	}

	public int getL_floor() {
		return l_floor;
	}

	public void setL_floor(int l_floor) {
		this.l_floor = l_floor;
	}

	public String getWhat() {
		return what;
	}

	public void setWhat(String what) {
		this.what = what;
	}
	
}
