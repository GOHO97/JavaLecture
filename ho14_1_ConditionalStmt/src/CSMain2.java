import java.util.Scanner;

public class CSMain2 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		System.out.print("나이 : ");
		int age = k.nextInt();
		System.out.println("-----------");

		switch (age) {
		case 20:
			System.out.println("어서오세요");
			// break;
		case 50:
			System.out.println("어유...");
			break;
		default:
			System.out.println("????");
			break;
		}
	}
}
