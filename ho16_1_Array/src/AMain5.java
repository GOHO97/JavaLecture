import java.util.Scanner;

public class AMain5 {
	
	
	public static void main(String[] args) {
Scanner k = new Scanner(System.in);
		
		System.out.print("������ ���� �� �ݾ� : ");
		int total = k.nextInt();
		System.out.print("���� �ݾ� : ");
		int takeMoney = k.nextInt();
		System.out.println("------------");
		
		int change = takeMoney - total;
		System.out.printf("�Ž����� : %d��\n", change);
//		int[] ȭ��� = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
//		int ���� = 0;
//		for (int ȭ�� : ȭ���) {
//			���� = change / ȭ��;
//			System.out.printf("%d¥�� : %d��\n", ȭ��, ����);
//			change %= ȭ��;
//		}
		
		int ȭ�� = 50000;
		int ���� = 0;
		boolean ���ν��� = true;
		while (true) {
			���� = change / ȭ��;
			System.out.printf("%d¥�� : %d��\n", ȭ��, ����);
			change %= ȭ��;
			if (���ν���) {
				ȭ�� /= 5;
			} else {
				ȭ�� /= 2;
			}
			���ν��� = !���ν���;
			if (change < 10) {
				break;
			}
		}
		
		}
	}

