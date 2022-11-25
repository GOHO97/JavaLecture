import java.util.Random;

public class HollzzackMuchine {
	Random muchine;

	public void gameStart() {
		HollzzackHuman p = join();
		int inLeftHand;
		String userAns;
		int win = 0;
		for (int i = 0; i < 10; i++) {
			inLeftHand = shake();
			userAns = tellNum(p);
			win += judge(inLeftHand, userAns);
		} 
		tellResult(win);
	}
	
	public HollzzackHuman join() {
		return new HollzzackHuman();
	}
	
	public int shake() {
		muchine = new Random();
		int a = muchine.nextInt(10) + 1;
		return a;
	}
	
	public String tellNum(HollzzackHuman p) {
		System.out.print("Ȧ? ¦? : ");
		return p.hollzzack();
	}
	
	public int judge(int coinCount, String hollzzack) {
		String gameAns = (coinCount % 2 == 1) ? "Ȧ" : "¦";
		String result = gameAns.equals(hollzzack) ? "����" : "��";
		System.out.printf("���� : %d��\n", coinCount);
		System.out.println(result);
		return result.equals("��") ? 0 : 1;
	}
	
	public void tellResult(int win) {
		System.out.printf("���� : %d��\n", win);
		System.out.printf("�� : %d��\n", 10 - win);
	}
	
}
