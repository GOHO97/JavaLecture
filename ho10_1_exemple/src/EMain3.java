import java.util.Scanner;

public class EMain3 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		System.out.print("������ ���� �� �ݾ� : ");
		int total = k.nextInt();
		System.out.print("���� �ݾ� : ");
		int takeMoney = k.nextInt();
		System.out.println("------------");
		
		int change = takeMoney - total;
		System.out.printf("�Ž����� : %d��\n", change);
		
		int ȭ�� = 50000;
		int ���� = change / ȭ��;
		System.out.printf("%d¥�� : %d��\n", ȭ��, ����);
		change %= ȭ��;  
		ȭ�� = 10000;
		���� = change / ȭ��;
		System.out.printf("%d¥�� : %d��\n", ȭ��, ����);
		change %= ȭ��;
		ȭ�� = 5000;
		���� = change / ȭ��;
		System.out.printf("%d¥�� : %d��\n", ȭ��, ����);
		change %= ȭ��;
		ȭ�� = 1000;
		���� = change / ȭ��;
		System.out.printf("%d¥�� : %d��\n", ȭ��, ����);
		change %= ȭ��;
		ȭ�� = 500;
		���� = change / ȭ��;
		System.out.printf("%d¥�� : %d��\n", ȭ��, ����);
		change %= ȭ��;
		ȭ�� = 100;
		���� = change / ȭ��;
		System.out.printf("%d¥�� : %d��\n", ȭ��, ����);
		change %= ȭ��;
		ȭ�� = 50;
		���� = change / ȭ��;
		System.out.printf("%d¥�� : %d��\n", ȭ��, ����);
		change %= ȭ��;
		ȭ�� = 10;
		���� = change / ȭ��;
		System.out.printf("%d¥�� : %d��\n", ȭ��, ����);
	}
}
