package com.soldesk.ho0629.thread.main;

public class UCMain {
	public static void main(String[] args) {
		
		MyThreadHohoho mth = new MyThreadHohoho();
		mth.start();
		
		Thread t = new Thread(new MTKeke());
		t.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("¤»");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
	}
}
