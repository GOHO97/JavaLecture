package ho0629_3_maydaymayday;

import java.io.BufferedReader;

import java.io.BufferedWriter;

import java.io.IOException;

import java.io.InputStream;

import java.io.InputStreamReader;

import java.io.OutputStream;

import java.io.OutputStreamWriter;

import java.net.Socket;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JTextArea;

// client

public class MDMain {

	public static void main(String[] args) {

		Socket s = null;

		Scanner k = new Scanner(System.in);

		// 접속하기

		try {

			s = new Socket("192.168.0.140", 9528);

			System.out.println("클 : 접속 완료");

			OutputStream os = s.getOutputStream();

			OutputStreamWriter osw = new OutputStreamWriter(os, "utf-8");

			BufferedWriter bw = new BufferedWriter(osw);

			InputStream is = s.getInputStream();

			InputStreamReader isr = new InputStreamReader(is, "utf-8");

			BufferedReader br = new BufferedReader(isr);
			
			Thread t = new Thread() {
			@Override
			public void run() {
				super.run();
				JFrame jf = new JFrame();
				JTextArea jta = new JTextArea();
				jf.add(jta);
				jf.setSize(300, 500);
				jf.setVisible(true);
				
				while(true)	{
					try {
						jta.append(br.readLine() + "\r\n");
					} catch (IOException e) {
						e.printStackTrace();
					}
					
				}
			}	
			
			};
			t.start();
			String msg = null;

			while (true) {

				System.out.print("클 뭐 : ");

				msg = k.next();

				bw.write(msg + "\r\n");

				bw.flush();

				

			}

		} catch (Exception e) {

			e.printStackTrace();

		}

		k.close();

		try {

			s.close();

		} catch (IOException e) {

			e.printStackTrace();

		}

	}

}
