package com.ho.db.main;

public class HomeController {
	public static void main(String[] args) {
		ConsoleScreen cs = new ConsoleScreen();
		Consolevalue cv = cs.getvalue();
		String result = MarioOutletDAO.regFloor(cv);
		cs.print(result);
		cs.closeS();
	}
}
