import java.util.Scanner;

public class TMain_2 {
	
	public static String getName() {
		Scanner k = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = k.next();
		return name;
	}
	
	public static double getHeight() {
		Scanner k = new Scanner(System.in);
		System.out.print("키[m] : ");
		double height = k.nextDouble();
		return (height > 3) ? getHeight() : height;
	}
	
	public static double getWeight() {
		Scanner k = new Scanner(System.in);
		System.out.print("몸무게 : ");
		double weight = k.nextDouble();
		return weight;
	}
	
	public static double getBmi(double h, double w) {
		double bmi = w / (h * h);
		return bmi;
	}
	
	public static String bmiJudgment(double bmi) {
		if (bmi >= 35) {
			return "고도비만 입니다.";
		} else if(bmi >= 30) {
			return "중도비만 입니다.";
		} else if(bmi >= 25) {
			return "경도비만 입니다.";
		} else if(bmi >= 23) {
			return "과체중 입니다.";
		} else if(bmi >= 18.5) {
			return "정상 입니다.";
		}
		return "저체중 입니다.";
	}
	
	public static void showResult(String name, double bmi, String result) {
		System.out.printf("BMI : %.1f\n", bmi);
		System.out.printf("%s씨는 %s\n", name, result);
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
