
public class FMain2 {
	
	public static int getGob(int a, int b) {
		int c = (a * b);
		return c; 
	}
	
	public static int getBigger(int a, int b) {
		int bigger = (a > b) ? a : b;
		return bigger;
	}
	
	public static void main(String[] args) throws InterruptedException {
		int q = 100;
		int w = 3;
		int e = getGob(q, w);
		Thread.sleep(e);
		System.out.println("¤»");
		int sdfa = getBigger(q, w);
		System.out.println(sdfa);
		
	}
}
