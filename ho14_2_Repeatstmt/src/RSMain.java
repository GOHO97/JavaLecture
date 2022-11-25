import java.util.Iterator;

public class RSMain {
	public static void main(String[] args) {

//		for (int i = 0; i < 5; i++) {
//			System.out.println("ㅋ");
//		}
//		for (int i = 7; i > 0; i--) {
//			System.out.println(i);
//		}
		// 1 3 5 7 9 11 13 15 17 19 가 나오게
//		for (int i = 1; i < 20 ; i += 2) {
//			System.out.println(i);
//		}
		// 256까지 2의 제곱 계산
//		for (int i = 1; i < 257; i *= 2) {
//			System.out.println(i);
//		}	
		// 1 부터 10 까지 다 더하면 얼마?
//		int a = 0;
//		for (int i = 1; i < 11; i++) {
//			a += i;
//		}
//		System.out.println(a);
//		// 1*2*3*4*5 = ?
//		int b = 1;
//		for (int i = 1; i < 6; i++) {
//			b *= i;
//		}
//		System.out.println(b);
//		// 1 + 2 - 3 + 4 - 5 + 6 - 7 + ... + 20
//		int c = 1;
//		for (int i = 2; i < 21; i++) {
//			if (i % 2 == 0) {
//				c += i;
//			} else {
//				c -= i;
//			}
//		}
	//	System.out.println(c);
		// 2 X 1 = 2
		// 2 X 2 = 4
		// ...
		// 2 X 9 = 18
//		for (int i = 1; i <= 9; i++) {
//			System.out.printf("2 * %d = %d\n", i, 2 * i);
		//}
		
		//2 X 1 = 2 ~~ 9 X 9 = 81
//		for (int dan = 2; dan <= 9; dan++) {
//			for (int i = 1; i <= 9; i++) {
//				System.out.printf("%d * %d = %d\n", dan, i, (dan * i));
//			}
//		}
		
		//
		for (int dan = 1; dan <= 9; dan++) {
			for (int i = 2; i <= 9; i++) {
				System.out.printf("%d * %d = %d\t", i, dan, (i * dan));
			}
			System.out.println();
		}
		
		
		
	}
}
