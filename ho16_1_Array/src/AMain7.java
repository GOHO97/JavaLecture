
public class AMain7 {
	
	public static void selectionSort(int[] a) {
		
		for (int j = 0; j < a.length - 1; j++) {
			int small = a[j];
			int smallIndex = j; //턴 수에 따라서 1턴이면 1턴에 있는 것의 자리를 바꿔야 해서.
			
			for (int i = j + 1; i < a.length; i++) {
				if(small > a[i]) {
					small = a[i];
					smallIndex = i; //이게 왜 i??
				}
			}
			int t = a[smallIndex];
			a[smallIndex] = a[j];
			a[j] = t;
		}
		
	}
	
	public static void main(String[] args) {
		int[] a = {10, 5, 3, 20, 7};
		
		selectionSort(a);
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
	}
}
}