package com.soldesk.ho0706.human;

public class Human {
	
	private void ready() {
		System.out.println("씻고");
		System.out.println("옷입고");
		System.out.println("엘베타고 내려가서");
	}
	
	public void goSchool() {
		ready();
		System.out.println("걸어서");
		System.out.println("학교도착");
		
	}
	
	public void goMart() {
		ready();
		System.out.println("차 끌고");
		System.out.println("마트 도착");
	}
}
