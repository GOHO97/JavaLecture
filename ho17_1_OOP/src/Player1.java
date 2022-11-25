import java.util.Random;

public class Player1 {
	Random hand = new Random();
	
	public int p1Hand() {
		return hand.nextInt(3) + 1;
		
	}
	
	
	
}
