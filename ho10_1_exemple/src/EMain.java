import java.util.Scanner;

public class EMain {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		System.out.print("바퀴 둘레 : ");
		double wheelC = k.nextDouble();
		System.out.print("앞 기어 톱니 수 : ");
		int fronG = k.nextInt();
		System.out.print("뒷 기어 톱니 수 : ");
		int backG = k.nextInt();
		System.out.print("발 구른 횟수 : ");
		int foot = k.nextInt();
		
		int a = foot * fronG;
		int b = a / backG;
		int = b * wheelC;
		System.out.println("---------------------");
		System.out.printf("이동거리 : %.1f", c);
		
	}
}
