package com.kwon.jun272ucc.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

// client
public class UCMain {
	public static void main(String[] args) {
		Socket s = null;
		Scanner k = new Scanner(System.in);
		try {
			// �����ϱ�
			s = new Socket("192.168.0.125", 4213);
			System.out.println("Ŭ : ���� �Ϸ�");
			
			OutputStream os = s.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os, "utf-8");
			BufferedWriter bw = new BufferedWriter(osw);

			InputStream is = s.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			BufferedReader br = new BufferedReader(isr);
			
			String msg = null;
			while (true) {
				System.out.print("Ŭ �� : ");
				msg = k.next();
				bw.write(msg + "\r\n");
				bw.flush();
				
				System.out.println(br.readLine());
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









