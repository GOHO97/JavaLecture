import java.util.Random;
import java.util.Scanner;

public class SMain2 {
	
	public static void bye(int w) {
		System.out.printf("%d����", w);
	}
	
	public static int user() {
		Scanner k = new Scanner(System.in);
		System.out.print("�� ����? : ");
		int u = k.nextInt();
		return (u==1 || u==2 || u==3) ? u : user();
	}
	
	public static int shake() {
		Random r = new Random();
		int rsp = r.nextInt(3) + 1;
		return rsp;
	}
	
	public static int judge(int gr, int ur) {
		if (ur == 1 && gr == 3) {
			System.out.println("�� : ��\n���� : ����\n���� ��");
			return 1;
		}else if(ur == 1 && gr == 1) {
			System.out.println("�� : ����\n���� : ����\n���");
			return 0;
		}else if (ur == 2 && gr == 1) {
			System.out.println("�� : ����\n���� : ����\n���� ��");
			return 1;
		}else if (ur == 2 && gr == 2) {
			System.out.println("�� : ����\n���� : ����\n���");
			return 0;
		}else if (ur == 3 && gr == 2) {
			System.out.println("�� : ����\n���� : ��\n���� ��");	
			return 1;
		}else if (ur == 3 && gr == 3) {
			System.out.println("�� : ��\n���� : ��\n���");
			return 0;
		}else {
			return 2;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("��Ģ\n1 = ����\n2 = ����\n3 = ��\n");
		System.out.println("----------------");
		int rsp;
		int u;
		int result;
		int win = 0;
		while (true) {
			rsp = shake();
			u = user();
			result = judge(rsp, u);
			if (result == 2) {
				break;
			}
			win += result;
			System.out.println("---------");
		}
		bye(win);
		
	}
}
