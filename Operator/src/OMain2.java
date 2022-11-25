import java.util.Scanner;

public class OMain2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = keyboard.next();
		System.out.print("키 : ");
		double cm = keyboard.nextDouble();
		System.out.print("나이 : ");
		int age = keyboard.nextInt();
		
		System.out.println("--------------");
		System.out.printf("이름은 %s, 키는 %.1fcm, 나이는 %d살\n",name, cm, age);
		
		boolean a = (cm >= 150);
		System.out.println(a);
		boolean b = (age < 5);
		System.out.println(b);
		boolean c = (age == 3);
		System.out.println(c);
		boolean d = (age != 4);
		System.out.println(d);
		boolean e = (age % 2 == 1);
		System.out.println(e);
		boolean f = name.equals("홍길동");
		System.out.println(f);
		boolean g = (age >= 5) && (cm > 150);
		System.out.println(g);
		boolean h = (age >= 80) && (cm >= 130);
		System.out.println(h);
		boolean i = (cm > 80) || (age < 5);
		System.out.println(i);
		boolean j = cm >= 150;
		System.out.println(j);
		boolean k = (age < 10) && (age > 3);
		System.out.println(k);
		boolean l = !k;
		System.out.println(l);
		boolean m = (age >= 20) ^ (cm >= 150);
		System.out.println(m);
		
		String comment = (age >= 20) ? "어서오세요" : "나가";
		System.out.println(comment);
		String comment2 = (age < 150) && (age > 100) ? "타" : "나가";
		System.out.println(comment2);
	}
}
