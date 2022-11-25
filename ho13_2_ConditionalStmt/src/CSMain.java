import java.util.Scanner;

public class CSMain {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = k.nextInt();
		
		System.out.println("---------");
		System.out.printf("나이는 %d살\n", age);
		
		if (age < 20) {
			System.out.println("나가");
		} else if (age < 30){ 
			System.out.println("올 때 메로나");
		} else if (age < 40) {
			System.out.println("어서오세요");
		} else {
			System.out.println("어유...");
		}
	}
}