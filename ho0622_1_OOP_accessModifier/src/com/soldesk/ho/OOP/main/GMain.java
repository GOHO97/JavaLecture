package com.soldesk.ho.OOP.main;

import com.soldesk.ho.OOP.gift.Diffuser;
import com.soldesk.ho.OOP.gift.Meat;

public class GMain {
	public static void main(String[] args) {
		Meat m = new Meat("���ο� �ִ� ����", "�ε左�÷������", "��ä��", 700);
		m.print();
		System.out.println("-----");
		
		Diffuser d = new Diffuser("���� ������1", "���ڵ��� ��ǻ��", "�������̿���");
		d.print();
		System.out.println("-----");
		
		d.from = "�߸𸣴»��";
	}
}
