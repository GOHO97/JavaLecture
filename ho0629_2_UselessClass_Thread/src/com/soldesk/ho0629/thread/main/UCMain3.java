package com.soldesk.ho0629.thread.main;

public class UCMain3 {
	public static void main(String[] args) {
		boolean end = false;
		
		Thread t = new Thread() {
			@Override
			public void run() {
				super.run();

				while (true) {
					System.out.println("¤¾");
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if(end) {
						break;
					}
				}
			}
		};
		t.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("¤»");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		end = true;
	}
}
