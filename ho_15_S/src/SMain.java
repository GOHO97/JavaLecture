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
		System.out.print("Ȧ? ¦? : ");
		String ua = k.next();
		return (ua.equals("Ȧ") || ua.equals("¦")) ? ua : tell();
	}
	
	public static String judge(int cc, String ua) {
		String gameAns = (cc % 2 == 1) ? "Ȧ" : "¦";
		String result = gameAns.equals(ua) ? "����" : "��";
		return result;
	}
	public static void showResult(int c, String r) {
		System.out.printf("���� : %��\n", c);
		System.out.println(r);
	}
	
	public static void bye(int w) {
		System.out.printf("���� : %d��, �� %d��", w, w-10);
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
			if (result.equals("����")) {
				win++;
			}
	}bye(win);
	}
}
