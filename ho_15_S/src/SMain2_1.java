import java.util.Random;
import java.util.Scanner;

public class SMain2_1 {
	
	public static void bye(int w) {
		System.out.printf("%d연승", w);
	}
	
	public static int userHand() {
		Scanner k = new Scanner(System.in);
		System.out.print("뭐 낼래? : ");
		int u = k.nextInt();
		return (u==1 || u==2 || u==3) ? u : userHand();
	}
	
	public static int comHand() {
		Random r = new Random();
		int c = r.nextInt(3) + 1;
		return c;
	}
	
	
	public static void rsp(int a, int b) {
		if (a == 1) {
			System.out.println("컴 : 가위");
		} else if (a == 2) {
			System.out.println("컴 : 바위");
		} else {
			System.out.println("컴 : 보");
		}
		if (b == 1) {
			System.out.println("나 : 가위");
		} else if (b == 2) {
			System.out.println("나 : 바위");
		} else {
			System.out.println("나 : 보");
		}
	}
	
	public static int judge(int a, int b) {
		int t = b - a;
		if (t == 0) {
			System.out.println("무");
			return 0;
		} else if(t == -1 || t == 2) {
			System.out.println("패");
			return 2;
		} else {
			System.out.println("승");
			return 1;
		} 
	}
	
	
	public static void main(String[] args) {
		System.out.println("1. 가위\n2. 바위\n3. 보\n--------");
		
		int comHand = 0;
		int userHand = 0;
		int result = 0;
		int win = 0;
		while (true) {
			userHand = userHand();
			comHand = comHand();
			rsp(comHand, userHand);
			result = judge(userHand, comHand);
			if (result == 2) {
				break;
			}
			win += result;
			System.out.println("-------");
		}
		bye(win);
	}
}
