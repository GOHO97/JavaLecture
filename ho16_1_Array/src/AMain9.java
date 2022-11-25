import java.util.Arrays;
import java.util.Random;

public class AMain9 {
	
	public static int pick(int[] lotto, int ballNo) {
		Random r = new Random();
		int n = r.nextInt(45) + 1;
		for (int i = 0; i < ballNo; i++) {
			if (lotto[i] == n) {
				return pick(lotto, ballNo);
			}
		}
		return n;
	}
	
	public static void main(String[] args) {
		int[] lotto = new int[6];
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = pick(lotto, i);
		} 
		Arrays.sort(lotto);
		for (int i : lotto) {
			System.out.println(i);
		}
	}
}
