
public class OMain2 {
	public static void main(String[] args) {
		
		Human h = new Human("ȫ�浿", 40);
		h.prinInfo();
		System.out.println("-----");
		
		Company c = new Company("�Ｚ", "����", h);
		c.printInfo();
		System.out.println("------");
		
		Cpmputer p = new Cpmputer(c, "i7-1234", "16", "500");
		p.printInfo();
		System.out.println("------");
		
		Academy a = new Academy("�ֵ���ũ", "�ų�����", p);
		a.printInfo();
		System.out.println("------");
		
		Insect i = new Insect("���", "�Ｑ���", a);
		i.printInfo();
		System.out.println("------");
		
		//���� �̸�
		System.out.println(i.name);
		// ������ ��� �� �̸�
		System.out.println(i.residence.name);
		//���� �� ��ġ
		System.out.println(i.residence.area);
		//���� �� ��ü ����
//		System.out.printf("%s, %s, %s\n", i.residence.name, i.residence.area, i.residence.server.manufacturer.name);
		i.residence.printInfo();
		//���� ���� ���� hdd �뷮
		System.out.println(i.residence.server.hdd);
		//���� �� ���� ��ü ���
//		System.out.printf("%s, %s, %s, %s\n", i.residence.server.manufacturer, i.residence.server.cpu, i.residence.server.ram, i.residence.server.hdd);
		i.residence.server.printInfo();
		//���� �� ���� ���� ȸ�� �̸�
		System.out.println(i.residence.server.manufacturer.name);
		//���� �� ���� ���� ȸ�� ����� �̸�
		System.out.println(i.residence.server.manufacturer.ceo.name);
	}
}
