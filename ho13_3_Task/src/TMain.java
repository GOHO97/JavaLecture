import java.util.Scanner;

public class TMain {
	
	public static double getbmi() {
		Scanner k = new Scanner(System.in);
		
		System.out.print("Ű(M�� �Է�) : ");
		double height = k.nextDouble();
		height = (height > 3) ? (height / 100) : height;
		System.out.print("������ : ");
		double weight = k.nextDouble();
		
		double bmi = weight / (height * height);
		return bmi;
		
	}
	
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("�̸� :");
		String name = k.next();
		double bmi = getbmi();
		if (bmi >= 30) {
			System.out.printf("%s���� ���� �Դϴ�.", name);
		} else if (bmi >= 25) {
			System.out.printf("%s���� �� �Դϴ�.", name);
		} else if (bmi >= 23) {
			System.out.printf("%s���� ��ü�� �Դϴ�.", name);
		} else if (bmi >= 18.5) {
			System.out.printf("%s���� ���� �Դϴ�.", name);
		} else {
			System.out.printf("%s���� ��ü�� �Դϴ�.", name);
		}
		
	}
}
