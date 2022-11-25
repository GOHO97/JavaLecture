import java.util.Scanner;

public class TMain {
	
	public static double getbmi() {
		Scanner k = new Scanner(System.in);
		
		System.out.print("키(M로 입력) : ");
		double height = k.nextDouble();
		height = (height > 3) ? (height / 100) : height;
		System.out.print("몸무게 : ");
		double weight = k.nextDouble();
		
		double bmi = weight / (height * height);
		return bmi;
		
	}
	
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("이름 :");
		String name = k.next();
		double bmi = getbmi();
		if (bmi >= 30) {
			System.out.printf("%s씨는 고도비만 입니다.", name);
		} else if (bmi >= 25) {
			System.out.printf("%s씨는 비만 입니다.", name);
		} else if (bmi >= 23) {
			System.out.printf("%s씨는 과체중 입니다.", name);
		} else if (bmi >= 18.5) {
			System.out.printf("%s씨는 정상 입니다.", name);
		} else {
			System.out.printf("%s씨는 저체중 입니다.", name);
		}
		
	}
}
