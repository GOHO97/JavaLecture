import java.util.Scanner;

public class OMain {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("x : ");
		int x = keyboard.nextInt();
		System.out.print("y : ");
		int y = keyboard.nextInt();
		
		System.out.println("----------");
		System.out.printf("x´Â %d, y´Â %d\n", x, y);
		
		int a = x + y;
		int b = x - y;
		int c = x * y;
		int d = x / y;
		int e = x % y;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		String s = "¤»";
		String f = x + s;
		System.out.println(f);
		
		double g = x / (double) y;
		System.out.println(g);
		
		x = 5;
		System.out.println(x);
		
		x = x + 3;
		System.out.println(x);
		
		int aa = 1;
		int bb = 2;
		int cc = aa << bb;
		System.out.println(cc);
	
	}
}
