import java.util.Scanner;

public class ConsoleinputMain {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("핸드폰 모델명 : ");
		String sellphoneName = keyboard.next();
		System.out.print("폰 가격 : ");
		int phonePrice = keyboard.nextInt();
		System.out.print("화면 사이즈 : ");
		double screenSize = keyboard.nextDouble();
		System.out.print("남은 할부 : ");
		int mip = keyboard.nextInt();
		
		System.out.println("---------");
		System.out.println(sellphoneName);
		System.out.printf("%d 만원\n", phonePrice);
		System.out.printf("%.1f 인치\n", screenSize);
		System.out.printf("%d 일\n", mip);
	}
}
