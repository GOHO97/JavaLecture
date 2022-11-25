import java.util.Scanner;

public class AMain5 {
	
	
	public static void main(String[] args) {
Scanner k = new Scanner(System.in);
		
		System.out.print("±¸¸ÅÇÑ ¹°°Ç ÃÑ ±Ý¾× : ");
		int total = k.nextInt();
		System.out.print("¹ÞÀº ±Ý¾× : ");
		int takeMoney = k.nextInt();
		System.out.println("------------");
		
		int change = takeMoney - total;
		System.out.printf("°Å½º¸§µ· : %d¿ø\n", change);
//		int[] È­Æóµé = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
//		int °¹¼ö = 0;
//		for (int È­Æó : È­Æóµé) {
//			°¹¼ö = change / È­Æó;
//			System.out.printf("%dÂ¥¸® : %d°³\n", È­Æó, °¹¼ö);
//			change %= È­Æó;
//		}
		
		int È­Æó = 50000;
		int °¹¼ö = 0;
		boolean ¿À·Î½ÃÀÛ = true;
		while (true) {
			°¹¼ö = change / È­Æó;
			System.out.printf("%dÂ¥¸® : %d°³\n", È­Æó, °¹¼ö);
			change %= È­Æó;
			if (¿À·Î½ÃÀÛ) {
				È­Æó /= 5;
			} else {
				È­Æó /= 2;
			}
			¿À·Î½ÃÀÛ = !¿À·Î½ÃÀÛ;
			if (change < 10) {
				break;
			}
		}
		
		}
	}

