import java.util.Scanner;

public class CSMain2 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		System.out.print("���� : ");
		int age = k.nextInt();
		System.out.println("-----------");

		switch (age) {
		case 20:
			System.out.println("�������");
			// break;
		case 50:
			System.out.println("����...");
			break;
		default:
			System.out.println("????");
			break;
		}
	}
}
