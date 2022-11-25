package ho10_1_exemple;

import java.util.Scanner;

public class EMain2 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = k.next();
		System.out.print("키 : ");
		double height = k.nextDouble();
		height = (height < 3) ? (height * 100) : height;
		System.out.print("몸무게 : ");
		double weight = k.nextDouble();
		
		double a = (height - 100) * 0.9;
		double b = (weight / a) * 100;
		String result = (b > 120) ? "비만입니다." : "정상입니다.";
		System.out.printf("표준체중 : %.1fkg\n", a);
		System.out.printf("비만도 : %.1f%%\n", b);
		System.out.printf("%s씨는 %s\n", name, result);
		System.out.println("종료 하려면 아무거나 쓰고 엔터를 누르세요.");
		k.next();
	}
}
