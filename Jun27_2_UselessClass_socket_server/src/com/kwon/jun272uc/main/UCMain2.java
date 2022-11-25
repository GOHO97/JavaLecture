package com.kwon.jun272uc.main;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

// ���
//		HTTP��� : ��û - ���� 
//		Socket��� : �ǽð� 

//		IP�ּ�   : �� ��ȭ��ȣ
//		��Ʈ��ȣ : ���� ����

// ���� - cmd - ipconfig - IPv4�ּ�

// ���� : ���񽺸� �����ϴ� ��ǻ��
// Ŭ���̾�Ʈ : ���񽺸� �̿��ϴ� ��

// server
public class UCMain2 {
	public static void main(String[] args) {
		ServerSocket ss = null;
		Scanner k = new Scanner(System.in);
		try {
			// ���񽺽���
			ss = new ServerSocket(4213);
			System.out.println("�� : �����");
			
			// �����Ҷ����� ��ٸ��ٰ�
			Socket s = ss.accept();
			System.out.println("�� : ���� ����");
			
			OutputStream os = s.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os, "utf-8");
			BufferedWriter bw = new BufferedWriter(osw);
			
			String msg = null;
			while (true) {
				System.out.print("�� �� : ");
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









