package ho10_1_exemple;

import java.util.Scanner;

public class EMain2 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = k.next();
		System.out.print("Ű : ");
		double height = k.nextDouble();
		height = (height < 3) ? (height * 100) : height;
		System.out.print("������ : ");
		double weight = k.nextDouble();
		
		double a = (height - 100) * 0.9;
		double b = (weight / a) * 100;
		String result = (b > 120) ? "���Դϴ�." : "�����Դϴ�.";
		System.out.printf("ǥ��ü�� : %.1fkg\n", a);
		System.out.printf("�񸸵� : %.1f%%\n", b);
		System.out.printf("%s���� %s\n", name, result);
		System.out.println("���� �Ϸ��� �ƹ��ų� ���� ���͸� ��������.");
		k.next();
	}
}
