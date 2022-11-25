
public class FMain3 {
	
	public static int getFactorial(int x) {
		int factorial = (x == 1) ? 1 : x * getFactorial(x - 1);
		return factorial;
	}
	
	public static int getPibonachi (int pos) {
		int pibonachi = (pos == 1 || pos == 2) ? 1 : (getPibonachi(pos - 1) + getPibonachi(pos -2));
		return pibonachi;
	}
	
	public static void main(String[] args) {
		System.out.println(getFactorial(5));
		System.out.println(getFactorial(3));
		System.out.println(getPibonachi(10));
	}
}