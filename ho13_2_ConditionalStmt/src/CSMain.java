import java.util.Scanner;

public class CSMain {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		System.out.print("���� : ");
		int age = k.nextInt();
		
		System.out.println("---------");
		System.out.printf("���̴� %d��\n", age);
		
		if (age < 20) {
			System.out.println("����");
		} else if (age < 30){ 
			System.out.println("�� �� �޷γ�");
		} else if (age < 40) {
			System.out.println("�������");
		} else {
			System.out.println("����...");
		}
	}
}