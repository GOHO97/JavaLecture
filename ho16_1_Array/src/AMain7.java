
public class AMain7 {
	
	public static void selectionSort(int[] a) {
		
		for (int j = 0; j < a.length - 1; j++) {
			int small = a[j];
			int smallIndex = j; //�� ���� ���� 1���̸� 1�Ͽ� �ִ� ���� �ڸ��� �ٲ�� �ؼ�.
			
			for (int i = j + 1; i < a.length; i++) {
				if(small > a[i]) {
					small = a[i];
					smallIndex = i; //�̰� �� i??
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