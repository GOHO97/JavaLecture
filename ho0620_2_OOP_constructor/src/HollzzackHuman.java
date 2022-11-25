import java.util.Scanner;

public class HollzzackHuman {
	Scanner mouth; 
	
	public String hollzzack() {
		mouth = new Scanner(System.in);
		String hollzzack = mouth.next();
		return (hollzzack.equals("Ȧ") || hollzzack.equals("¦")) ? hollzzack : hollzzack();
	}
	
	
}
