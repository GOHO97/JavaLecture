import java.util.Scanner;

public class OMain2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = keyboard.next();
		System.out.print("Ű : ");
		double cm = keyboard.nextDouble();
		System.out.print("���� : ");
		int age = keyboard.nextInt();
		
		System.out.println("--------------");
		System.out.printf("�̸��� %s, Ű�� %.1fcm, ���̴� %d��\n",name, cm, age);
		
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
		boolean f = name.equals("ȫ�浿");
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
		
		String comment = (age >= 20) ? "�������" : "����";
		System.out.println(comment);
		String comment2 = (age < 150) && (age > 100) ? "Ÿ" : "����";
		System.out.println(comment2);
	}
}
