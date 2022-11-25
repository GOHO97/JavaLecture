package com.ho.db.main;

public class HomeController2 {
	public static void main(String[] args) {
		ConsoleScreen cs = new ConsoleScreen();
		cs.print(MarioOutletDAO.selectFloor());
		cs.closeS();
	}
}
