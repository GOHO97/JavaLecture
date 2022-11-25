import java.util.Random;

public class Assessor {
	Random numberMachine = new Random();
	
	public void gameStart() {
		Player p = callPlayer();
		int num = 0;
		int playNum;
		boolean go;
		
		for (int turn = 1; true; turn++) {
			num = pickNumber();
			playNum = askNumber(p);
			go = judge(playNum, num, turn);
			if(!go) {
				break;
			}
		}
	}
	
	public Player callPlayer() {
		return new Player();
	}
	
	public int pickNumber() {
		int number = numberMachine.nextInt(10000) + 1;
		 return number;
	}
	
	public int askNumber(Player p) {
		System.out.print("What? : ");
		p.tellNumber();
		return (p.number > 0 && p.number < 10001) ? p.number : askNumber(p);
	}


	public boolean judge(int p, int num, int turn) {
		if (p == num) {
			 System.out.printf("%d턴만에 정답", turn);
			 return true;
			} else if(p > num){
				System.out.println("DOWN!");
			} else {
				System.out.println("UP!");
			}
			return false;
		}
	}




	

