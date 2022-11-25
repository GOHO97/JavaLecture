import java.util.Random;
import java.util.Scanner;

public class RSMain5 {
	
	public static int thinAns() {
		Random r = new Random();
		int answer = r.nextInt(10000) + 1;
		return answer;
	}
	
	public static int tell() {
		Scanner k = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = k.nextInt();
		return (num > 0 && num < 10001) ? num : tell();
	}
	
	public static boolean judge(int ga, int ua, int t) {
		if (ga == ua) {
			System.out.printf("%d번 만에 정답.\n", t);
			return false;
		} else if(ga > ua){
			System.out.println("UP!");
		} else {
			System.out.println("DOWN!");
		} 
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println("Wellcome UpDown Game");
		int answer = thinAns();
	//	System.out.println(answer);
		
		int num = 0;
		boolean go;
		for (int turn = 1; true; turn++) {
			num = tell();
			go = judge(answer, num, turn);
			if (!go) {
				break;
			}
		}
	}

}
