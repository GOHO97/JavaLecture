import java.util.Iterator;

public class RSMain2 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("せ");
			}
			System.out.println();
		}
		//せ
		//せせ
		//せせせ
		//せせせせ
		//せせせせせ
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("せ");
			}
			System.out.println();	
	}
//		せせせせせ
//		せせせせ
//		せせせ
//		せせ
//		せ
		for (int i = 5; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("せ");
			}
			System.out.println();	
	}
//		せ
//		 せ
//		  せ
//		   せ
//		    せ
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == i) {
					System.out.print("せ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		for (int i1 = 0; i1 < 5; i1++) {
			for (int j = 0; j < i1; j++) {
				System.out.print(" ");
			} System.out.println("せ");
		}
		}
//		     せ
//		    せせ
//		   せせせ
//		  せせせせ
//		 せせせせせ 
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print((j >= (5 - i - 1)) ? "せ" : " ");
			} System.out.println();
		}
		String s;
		for (int i = 0; i < 5; i++) {
			s = (i % 2 == 1) ? "ぞ" : "せ";
			for (int j = 0; j <= (i * 2); j++) {
				System.out.print(s);
			} System.out.println();
		}
		
}
}
