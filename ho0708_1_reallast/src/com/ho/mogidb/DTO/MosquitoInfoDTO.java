package com.ho.mogidb.DTO;

public class MosquitoInfoDTO {
	private double water;
	private double house;
	private double park;
	
	public MosquitoInfoDTO() {
		// TODO Auto-generated constructor stub
	}

	public MosquitoInfoDTO(double water, double house, double park) {
		super();
		this.water = water;
		this.house = house;
		this.park = park;
	}

	public double getWater() {
		return water;
	}

	public void setWater(double water) {
		this.water = water;
	}

	public double getHouse() {
		return house;
	}

	public void setHouse(double house) {
		this.house = house;
	}

	public double getPark() {
		return park;
	}

	public void setPark(double park) {
		this.park = park;
	}
	
	
}
