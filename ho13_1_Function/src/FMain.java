
public class FMain {
	
	public static void printHab(int a, int b) {
		int hab = a + b;
		System.out.println(hab);
	}
	
	public static void test(int asd) {
		System.out.println(asd);
	}
	
	
	public static void yaDambae() {
		System.out.println("야 엄마한테 가서 만원 달라고 해서");
		System.out.println("동네 슈퍼 가서");
		System.out.println("한라산 한 갑 달라고 하고");
		System.out.println("남는 돈은 너 과자 하나 사고");
		System.out.println("한라산이랑 남는 돈 가져와");
	}
	
	public static void holZzak(int a) {
		String comment = (a % 2 == 1) ? "홀수" : "짝수";
		System.out.println(comment);
	}
	
	public static void minus(int a, int b) {
		int sum = a - b;
		System.out.println(sum);
	}
	
	public static void minus3(int a, int b, int c) {
		System.out.println(a - b - c);
	}
	
	public static void main(String[] args) {
		yaDambae();
		System.out.println("----------");
		printHab(10, 3);
		printHab(33, 2);
		System.out.println("----------");
		int x = 30;
		test(x);
		System.out.println("----------");
		holZzak(8);
		System.out.println("----------");
		minus(3, 5);
		System.out.println("----------");
		minus3(5, 6, 1);
	}
	
}
