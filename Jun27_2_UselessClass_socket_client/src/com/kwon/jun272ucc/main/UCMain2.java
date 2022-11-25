package com.kwon.jun272ucc.main;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

// client
public class UCMain2 {
	public static void main(String[] args) {
		Socket s = null;
		try {
			Robot r = new Robot();
			// 접속하기
			s = new Socket("192.168.0.125", 4213);
			System.out.println("클 : 접속 완료");
			
			InputStream is = s.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			BufferedReader br = new BufferedReader(isr);
			
			String msg = null;
			while (true) {
				msg = br.readLine();
				if (msg.equals("l")) {
					r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
					r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
				} else if(msg.equals("r")) {
					r.mousePress(InputEvent.BUTTON3_DOWN_MASK);
					r.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
				} else {
					String[] where = msg.split(",");
					int x = Integer.parseInt(where[0]);
					int y = Integer.parseInt(where[1]);
					r.mouseMove(x, y);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			s.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}









