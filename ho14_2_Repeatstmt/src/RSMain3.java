import java.util.Random;
import java.util.Scanner;

public class RSMain3 {
	public static void main(String[] args) {
		int a = 0;
		for (int i = 1; i < 8; i++) {
			a += i;
		}
		System.out.println(a);
		
		int b = 0;
		int ii = 0;
		while (b < 100) {
			ii++;
			b += ii;
		}
		System.out.println(b);
		System.out.println(ii);
		System.out.println("-----------");
		
		//������ ���ڰ� ��� 7���� �� ����
		
		Random r = new Random();
		int x = r.nextInt(10);
		System.out.println(x);
		while (x != 7) {
			x = r.nextInt(10);
			System.out.println(x);
		}
		System.out.println("---------");
		
//		Scanner k = new Scanner(System.in);
//		System.out.print("�Է��ϼ��� : ");
//		String msg = k.next();
//		while (!msg.equals("end")) {
//			System.out.print("�Է��ϼ��� : ");
//			msg = k.next();
//		}
		
		System.out.println("------------");
		
		
		int y = r.nextInt(3) + 1;
		System.out.println(y);
		while(y != 2) {
			y = r.nextInt(3) + 1;
			System.out.println(y);
		}
		System.out.println("-----------");
		
		do {
			y = r.nextInt(3) + 1;
			System.out.println(y);
		} while (y != 2);
	} 
	

}
