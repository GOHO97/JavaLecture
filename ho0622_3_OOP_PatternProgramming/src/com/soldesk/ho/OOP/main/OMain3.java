package com.soldesk.ho.OOP.main;

import com.soldesk.ho.OOP.Human.Soldesk;
import com.soldesk.ho.OOP.Human.Student;
import com.soldesk.ho.OOP.cellphone.Cellphone;

public class OMain3 {
	public static void main(String[] args) {
		Cellphone.call("010-xxxx-xxxx");
		
		Soldesk sl = new Soldesk();
		Student s = sl.talk("ȫ�浿", "����");
		s.print();
		Student s2 = sl.talk("�ڱ浿", "�Ⱦ�");
		s2.print();
		
				
		
	}
}
