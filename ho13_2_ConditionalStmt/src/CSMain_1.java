import java.util.Scanner;

public class CSMain_1 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		System.out.print("중간고사 : ");
		double middle = k.nextDouble();
		System.out.print("기말고사 : ");
		double last = k.nextDouble();

		System.out.println("--------");
		double b = (middle + last) / 2;
		System.out.printf("평균 : %.1f점\n", b);

		if (b >= 90) {
			System.out.println("수");
		} else if (b >= 80) {
			System.out.println("우");
		} else if (b >= 70) {
			System.out.println("미");
		} else if (b >= 60) {
			System.out.println("양");
		} else {
			System.out.println("가");
		}
	}
}
