import java.util.Random;

public class AMain8 {
	
	public static void getLottoNum(int[] lotto) {
		Random r = new Random();
		for (int i = 5; i > -1; i--) {
			int lottoNum = r.nextInt(45) + 1;
			 lotto[i] = lottoNum;
			for (int j = 6; j > i + 1; j--) {
				if(lotto[i] == lotto[i - 1]) {
					lotto[i] = r.nextInt(45) + 1;
					
				}
			}
		}
	}
//		for (int i = 0; i < 6; i++) {
//			lottoNum = r.nextInt(45) + 1;
//			int num = lottoNum;
//			if(lottoNum == num) {
//				lottoNum = r.nextInt(45) + 1;
//			}
//			System.out.println(lottoNum);
//		}
		
	
	
	public static void main(String[] args) {
		int[] lotto = new int[6];
		getLottoNum(lotto);
		
	}
}
