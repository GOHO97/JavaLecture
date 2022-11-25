package com.soldesk.ho.OOP.restaurant;

public class Ramen extends Restaurant{
	private int figure;
	private boolean empty;
	
	public Ramen() {
		// TODO Auto-generated constructor stub
	}

	public Ramen(String name, String address, int figure, boolean seat) {
		super(name, address);
		this.figure = figure;
		this.empty = seat;
	}

	public int getFigure() {
		return figure;
	}

	public void setFigure(int figure) {
		this.figure = figure;
	}

	public boolean isEmpty() {
		return empty;
	}

	public void setEmpty(boolean empty) {
		this.empty = empty;
	}

	@Override
	public void print() {
		System.out.println(getName());
		System.out.println(figure);
		System.out.println(empty);
		System.out.println(getAddress());
	}
}
