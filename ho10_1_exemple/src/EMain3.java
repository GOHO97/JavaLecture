import java.util.Scanner;

public class EMain3 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		System.out.print("±¸¸ÅÇÑ ¹°°Ç ÃÑ ±Ý¾× : ");
		int total = k.nextInt();
		System.out.print("¹ÞÀº ±Ý¾× : ");
		int takeMoney = k.nextInt();
		System.out.println("------------");
		
		int change = takeMoney - total;
		System.out.printf("°Å½º¸§µ· : %d¿ø\n", change);
		
		int È­Æó = 50000;
		int °¹¼ö = change / È­Æó;
		System.out.printf("%dÂ¥¸® : %d°³\n", È­Æó, °¹¼ö);
		change %= È­Æó;  
		È­Æó = 10000;
		°¹¼ö = change / È­Æó;
		System.out.printf("%dÂ¥¸® : %d°³\n", È­Æó, °¹¼ö);
		change %= È­Æó;
		È­Æó = 5000;
		°¹¼ö = change / È­Æó;
		System.out.printf("%dÂ¥¸® : %d°³\n", È­Æó, °¹¼ö);
		change %= È­Æó;
		È­Æó = 1000;
		°¹¼ö = change / È­Æó;
		System.out.printf("%dÂ¥¸® : %d°³\n", È­Æó, °¹¼ö);
		change %= È­Æó;
		È­Æó = 500;
		°¹¼ö = change / È­Æó;
		System.out.printf("%dÂ¥¸® : %d°³\n", È­Æó, °¹¼ö);
		change %= È­Æó;
		È­Æó = 100;
		°¹¼ö = change / È­Æó;
		System.out.printf("%dÂ¥¸® : %d°³\n", È­Æó, °¹¼ö);
		change %= È­Æó;
		È­Æó = 50;
		°¹¼ö = change / È­Æó;
		System.out.printf("%dÂ¥¸® : %d°³\n", È­Æó, °¹¼ö);
		change %= È­Æó;
		È­Æó = 10;
		°¹¼ö = change / È­Æó;
		System.out.printf("%dÂ¥¸® : %d°³\n", È­Æó, °¹¼ö);
	}
}
