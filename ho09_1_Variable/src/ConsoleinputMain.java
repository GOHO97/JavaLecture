import java.util.Scanner;

public class ConsoleinputMain {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("�ڵ��� �𵨸� : ");
		String sellphoneName = keyboard.next();
		System.out.print("�� ���� : ");
		int phonePrice = keyboard.nextInt();
		System.out.print("ȭ�� ������ : ");
		double screenSize = keyboard.nextDouble();
		System.out.print("���� �Һ� : ");
		int mip = keyboard.nextInt();
		
		System.out.println("---------");
		System.out.println(sellphoneName);
		System.out.printf("%d ����\n", phonePrice);
		System.out.printf("%.1f ��ġ\n", screenSize);
		System.out.printf("%d ��\n", mip);
	}
}
