import java.util.Scanner;

public class FMain3_2 {
	
	public static int inputNo() {
		Scanner k = new Scanner(System.in);
		System.out.print("¦�� : ");
		int n = k.nextInt();
		n = (n % 2 == 0) ? n : inputNo();
		return n;
	}
	
	public static void main(String[] args) {
		
		int a = inputNo();
		System.out.println("-----------");
		System.out.printf("�Է��� ���ڴ� %d�Դϴ�.\n", a);
	}
}
