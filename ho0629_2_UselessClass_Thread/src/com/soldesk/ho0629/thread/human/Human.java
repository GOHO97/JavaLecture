package com.soldesk.ho0629.thread.human;

public class Human {
	
	private String brain;
	
	public synchronized void sayName() {
		for (int i = 0; i < 10; i++) {
			brain = "ȫ�浿";
			try {
				Thread.sleep(200);
				System.out.println("�̸� : " + brain);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void sayHobby() {
		for (int i = 0; i < 10; i++) {
			brain = "����";
			try {
				Thread.sleep(1000);
				System.out.println("��� : " + brain);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void introduce() {
		Thread t = new Thread() {
			@Override
			public void run() {
				super.run();
				sayHobby();
			}
		};
		t.start();
		sayName();
	}
}
