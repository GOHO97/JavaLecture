
public class FMain {
	
	public static void printHab(int a, int b) {
		int hab = a + b;
		System.out.println(hab);
	}
	
	public static void test(int asd) {
		System.out.println(asd);
	}
	
	
	public static void yaDambae() {
		System.out.println("�� �������� ���� ���� �޶�� �ؼ�");
		System.out.println("���� ���� ����");
		System.out.println("�Ѷ�� �� �� �޶�� �ϰ�");
		System.out.println("���� ���� �� ���� �ϳ� ���");
		System.out.println("�Ѷ���̶� ���� �� ������");
	}
	
	public static void holZzak(int a) {
		String comment = (a % 2 == 1) ? "Ȧ��" : "¦��";
		System.out.println(comment);
	}
	
	public static void minus(int a, int b) {
		int sum = a - b;
		System.out.println(sum);
	}
	
	public static void minus3(int a, int b, int c) {
		System.out.println(a - b - c);
	}
	
	public static void main(String[] args) {
		yaDambae();
		System.out.println("----------");
		printHab(10, 3);
		printHab(33, 2);
		System.out.println("----------");
		int x = 30;
		test(x);
		System.out.println("----------");
		holZzak(8);
		System.out.println("----------");
		minus(3, 5);
		System.out.println("----------");
		minus3(5, 6, 1);
	}
	
}
