import java.util.Random;
import java.util.Scanner;

public class SMain2_1 {
	
	public static void bye(int w) {
		System.out.printf("%d����", w);
	}
	
	public static int userHand() {
		Scanner k = new Scanner(System.in);
		System.out.print("�� ����? : ");
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
			System.out.println("�� : ����");
		} else if (a == 2) {
			System.out.println("�� : ����");
		} else {
			System.out.println("�� : ��");
		}
		if (b == 1) {
			System.out.println("�� : ����");
		} else if (b == 2) {
			System.out.println("�� : ����");
		} else {
			System.out.println("�� : ��");
		}
	}
	
	public static int judge(int a, int b) {
		int t = b - a;
		if (t == 0) {
			System.out.println("��");
			return 0;
		} else if(t == -1 || t == 2) {
			System.out.println("��");
			return 2;
		} else {
			System.out.println("��");
			return 1;
		} 
	}
	
	
	public static void main(String[] args) {
		System.out.println("1. ����\n2. ����\n3. ��\n--------");
		
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
