
public class Referee {
	String[] ruleBook = {null, "����", "����", "��"};

	public void reedRuleBook() {
		for (int i = 1; i < ruleBook.length; i++) {
			System.out.printf("%d. %s\n", i, ruleBook[i]);
		}
		System.out.println("-------");
	}
	
	public  void start() {
		Player1 p1 = callBlueCorner();
		Player2 p2 = callRedCorner();
		reedRuleBook();
	}
	
	
	public Player1 callBlueCorner() {
		return new Player1();
	}
	
	public Player2 callRedCorner() {
		return new Player2();
	}
	
	public int p1Hand(Player1 p1) {
		System.out.println("�� : ");
		p1.p1Hand();
	}
	
	
	public int p2Hand(Player2 p2) {
	}
	
	public void printHand(int p1Hand, int p2Hand) {
		
	}
	
	public void judge() {
		
	}
	
}
