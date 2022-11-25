import java.util.Random;
import java.util.Scanner;

public class SMain {
	
	public static int shake( ) {
		Random r = new Random();
		int cc = r.nextInt(10) + 1;
		return cc;
	}
	
	public static String tell( ) {
		Scanner k = new Scanner(System.in);
		System.out.print("È¦? Â¦? : ");
		String ua = k.next();
		return (ua.equals("È¦") || ua.equals("Â¦")) ? ua : tell();
	}
	
	public static String judge(int cc, String ua) {
		String gameAns = (cc % 2 == 1) ? "È¦" : "Â¦";
		String result = gameAns.equals(ua) ? "Á¤´ä" : "¶¯";
		return result;
	}
	public static void showResult(int c, String r) {
		System.out.printf("µ¿Àü : %°³\n", c);
		System.out.println(r);
	}
	
	public static void bye(int w) {
		System.out.printf("Á¤´ä : %d¹ø, ¶¯ %d¹ø", w, w-10);
	}
	
	public static void main(String[] args) {
		int coinCount = 0;
		String userAns = null;
		String result = null;
		int win = 0;
		for (int i = 0; i < 10; i++) {
			coinCount = shake();
			userAns = tell();
			result = judge(coinCount, userAns);
			showResult(coinCount, result);
			if (result.equals("Á¤´ä")) {
				win++;
			}
	}bye(win);
	}
}
