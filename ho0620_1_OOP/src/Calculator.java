
public class Calculator {
	
	public static void hab(int a, int b) {
		System.out.println(a + b);
	}
	
	public static void hab(int a, int b, int c) {
		System.out.println(a + b + c);
	}
	
	//�ڷ���... ������ (...���� ���� Java ����)
	public static void printGob(int...v) {
		int gob = 1;
		for (int i : v) {
			gob *= i;
		}
		System.out.println(gob);
	}
}
