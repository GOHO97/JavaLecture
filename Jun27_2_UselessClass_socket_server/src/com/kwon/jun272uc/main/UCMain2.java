package com.kwon.jun272uc.main;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

// 통신
//		HTTP통신 : 요청 - 응답 
//		Socket통신 : 실시간 

//		IP주소   : 컴 전화번호
//		포트번호 : 무슨 서비스

// 시작 - cmd - ipconfig - IPv4주소

// 서버 : 서비스를 제공하는 컴퓨터
// 클라이언트 : 서비스를 이용하는 컴

// server
public class UCMain2 {
	public static void main(String[] args) {
		ServerSocket ss = null;
		Scanner k = new Scanner(System.in);
		try {
			// 서비스시작
			ss = new ServerSocket(4213);
			System.out.println("서 : 대기중");
			
			// 접속할때까지 기다리다가
			Socket s = ss.accept();
			System.out.println("서 : 누가 접속");
			
			OutputStream os = s.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os, "utf-8");
			BufferedWriter bw = new BufferedWriter(osw);
			
			String msg = null;
			while (true) {
				System.out.print("서 뭐 : ");
				msg = k.next();
				bw.write(msg + "\r\n");
				bw.flush();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		k.close();
		try {
			ss.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}









