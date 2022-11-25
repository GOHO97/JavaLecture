package com.soldesk.ho0629.thread.main;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MyThreadHohoho extends Thread {
	@Override
	public void run() {
		super.run();
		
		JFrame jf = new JFrame();
		JTextArea jta = new JTextArea();
		jf.add(jta);
		jf.setSize(300, 300);
		jf.setVisible(true);
		
		for (int i = 0; i < 10; i++) {
			jta.append("¤¾\r\n");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
