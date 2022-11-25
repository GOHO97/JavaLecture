import java.util.Random;

public class TodayMain {
	public static void main(String[] args) throws InterruptedException {
		String[] ar = {"´ëÃ¢µ¤¹ä", "ÃÊ¹ä", "ºÎ´ëÂî°³",
				"¶ÒºÒ", "±¹¹ä", "Áß½Ä", "º¸½ÓÁ¤½Ä", 
				"ÂŞ²Ù¹ÌÁ¤½Ä", "°íÃßÀåÂî°³"};
		
		Random r = new Random();
		
		for (int i = 0; i < 10; i++) {
			System.out.println(ar[r.nextInt(ar.length)]);
			Thread.sleep(700);
		}
	}
}
