import java.util.Scanner;

public class EMain {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		System.out.print("���� �ѷ� : ");
		double wheelC = k.nextDouble();
		System.out.print("�� ��� ��� �� : ");
		int fronG = k.nextInt();
		System.out.print("�� ��� ��� �� : ");
		int backG = k.nextInt();
		System.out.print("�� ���� Ƚ�� : ");
		int foot = k.nextInt();
		
		int a = foot * fronG;
		int b = a / backG;
		int = b * wheelC;
		System.out.println("---------------------");
		System.out.printf("�̵��Ÿ� : %.1f", c);
		
	}
}
