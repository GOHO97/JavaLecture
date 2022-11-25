import java.util.Scanner;

public class FMain3_2 {
	
	public static int inputNo() {
		Scanner k = new Scanner(System.in);
		System.out.print("짝수 : ");
		int n = k.nextInt();
		n = (n % 2 == 0) ? n : inputNo();
		return n;
	}
	
	public static void main(String[] args) {
		
		int a = inputNo();
		System.out.println("-----------");
		System.out.printf("입력한 숫자는 %d입니다.\n", a);
	}
}
