import java.util.Iterator;

public class AMain {
	public static void main(String[] args) {
		int[] kor = {100, 90, 50, 30, 70, 85, 43};
		
//		for (int i = 0; i < kor.length; i++) {
//			System.out.println(kor[i]);
//		}
		
		int sum = 0;
		for (int k: kor) {
			System.out.println(k);
			sum += k;
		}
		System.out.println(sum);
		System.out.println((double) sum / kor.length);
	
	}
}
