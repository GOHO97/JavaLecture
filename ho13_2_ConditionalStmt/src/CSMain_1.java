import java.util.Scanner;

public class CSMain_1 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		System.out.print("�߰���� : ");
		double middle = k.nextDouble();
		System.out.print("�⸻��� : ");
		double last = k.nextDouble();

		System.out.println("--------");
		double b = (middle + last) / 2;
		System.out.printf("��� : %.1f��\n", b);

		if (b >= 90) {
			System.out.println("��");
		} else if (b >= 80) {
			System.out.println("��");
		} else if (b >= 70) {
			System.out.println("��");
		} else if (b >= 60) {
			System.out.println("��");
		} else {
			System.out.println("��");
		}
	}
}
