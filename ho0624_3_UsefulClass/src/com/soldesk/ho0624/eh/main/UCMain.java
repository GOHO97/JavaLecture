package com.soldesk.ho0624.eh.main;

import java.util.StringTokenizer;

public class UCMain {
	public static void main(String[] args) {
		String s = new String("�� ����� �� �� ������ �β���");
		
		System.out.println(s.charAt(2));
		//���ڴ� ���°��
		System.out.println(s.indexOf("��"));
		//��ü ���ڼ�?
		System.out.println(s.length());
		//�β��Է� ������
		System.out.println(s.endsWith("�β���"));
		//����� -> �����
		System.out.println(s.replace("�����", "�����"));
		//2~5 ��° ���ڸ�
		System.out.println(s.substring(3, 6));
		
		String ss = String.format("%d", 10);
		System.out.println(ss);
		
		String s2;
		for (int i = 1; i < 13; i++) {
			s2 = String.format("hero_kick_%02d.png", i);
			System.out.println(s2);
		}
		
		// �Ʊ� s �ڿ� ����Ե� �߰� �� �־��
		System.out.println(s.concat(" ����Ե� �߰�"));
		
		StringBuffer sb = new StringBuffer("������");
		sb.append("������");
		System.out.println(sb);
		
		String data = "����, 30, 80, ��"; //���� ������
		String[] dd = data.split(",");
		System.out.println(dd[1]);
		
		String data2 = "���� �� ���� ���� ����."; //������ ������
		StringTokenizer st = new StringTokenizer(data2, " ");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		
		
	}
}
