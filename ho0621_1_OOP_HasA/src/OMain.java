
//����� �� �� ���� : ����
public class OMain {
	// ����� ��
	public static void main(String[] args) {
		//����� �� : JVM�� OMain.main�� ���� ���� �����ϱ� ������
		Dog d = new Dog("ö��", 3);
		d.printInfo();
		System.out.println("-----");
		
		Human h = new Human("ȫ�浿", 30);
		h.pet = d;
		h.prinInfo();
		System.out.println("-----");
		
		Human h2 = new Human("��浿", 20);
		h2.prinInfo();
		System.out.println("-----");
		
		Human h3 = new Human("ȫ�Ǽ�", 60, d);
		h3.prinInfo();
		System.out.println("-----");
		
	}
}
