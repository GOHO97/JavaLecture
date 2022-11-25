import java.util.Scanner;

public class TMain_2 {
	
	public static String getName() {
		Scanner k = new Scanner(System.in);
		System.out.print("�̸� : ");
		String name = k.next();
		return name;
	}
	
	public static double getHeight() {
		Scanner k = new Scanner(System.in);
		System.out.print("Ű[m] : ");
		double height = k.nextDouble();
		return (height > 3) ? getHeight() : height;
	}
	
	public static double getWeight() {
		Scanner k = new Scanner(System.in);
		System.out.print("������ : ");
		double weight = k.nextDouble();
		return weight;
	}
	
	public static double getBmi(double h, double w) {
		double bmi = w / (h * h);
		return bmi;
	}
	
	public static String bmiJudgment(double bmi) {
		if (bmi >= 35) {
			return "���� �Դϴ�.";
		} else if(bmi >= 30) {
			return "�ߵ��� �Դϴ�.";
		} else if(bmi >= 25) {
			return "�浵�� �Դϴ�.";
		} else if(bmi >= 23) {
			return "��ü�� �Դϴ�.";
		} else if(bmi >= 18.5) {
			return "���� �Դϴ�.";
		}
		return "��ü�� �Դϴ�.";
	}
	
	public static void showResult(String name, double bmi, String result) {
		System.out.printf("BMI : %.1f\n", bmi);
		System.out.printf("%s���� %s\n", name, result);
	}
	
	public static void main(String[] args) {
		String name = getName();
		double height = getHeight();
		double weight = getWeight();
		System.out.println("--------");
		double bmi = getBmi(height, weight);
		System.out.println(bmi);
		String result = bmiJudgment(bmi);
		showResult(name, bmi, result);
		
	}
}
