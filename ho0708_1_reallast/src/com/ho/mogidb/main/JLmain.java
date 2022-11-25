package com.ho.mogidb.main;


public class JLmain {
	public static void main(String[] args) {
		ConesoleScreen cs = new ConesoleScreen();
		cs.printResult(MosquitoDAO.getMda().regMosquitoInfo(MosquitoDAO.getMda().getMosquitoInfo()));
	}
}
