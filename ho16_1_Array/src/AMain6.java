
public class AMain6 {
	
	public static void test(int[] a) {
		int i;
		int b = 0;
		
		for (int j = 1; j < a.length; j++) {
			for (i = 0; i < a.length-j; i++) {
				if(a[i] > a[i + 1]) {
					b = a[i + 1];
					a[i+1] = a[i];
					a[i] = b;
			}
		} 
		}
		}
	
	
	public static void main(String[] args) {
		int[] ar = {123, 45, 89, 1234, 854, 242, 584};
		
		test(ar);
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
//		for (int i : ar) {
//			System.out.println(i);
//		}
//		
	}
}
