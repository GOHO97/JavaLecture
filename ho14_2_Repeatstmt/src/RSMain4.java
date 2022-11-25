import java.util.Random;
import java.util.Scanner;

public class RSMain4 {
	public static void main(String[] args) {
		
		for (int i = -3; i < 4; i++) {
			if (i == 0) {
				//break;
				continue;
			}
			System.out.println(i);
		}
		System.out.println("-----------");
		
		Random r = new Random();
		int x;
		while (true) {
			x = r.nextInt(10);
			System.out.println(x);
			
			if(x == 7) {
				break;
			}
		}
		System.out.println("-----------");
		Scanner k = new Scanner(System.in);
		System.out.print("입력 해주세요 : ");
		String input = k.next();
		
		aaa : while (true) {
			System.out.print("입력 해주세요 : ");
			input = k.next();
			
			bbb :switch (input) {
			case "say":
				System.out.println("ho");
				break;
			case "end":
				break aaa;
			default:
				break;
			}
		}
		System.out.println("--------");
		iii : for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 2) {
					break iii;
				}
				System.out.println(i + "," + j);
			}
		}
	}
}
