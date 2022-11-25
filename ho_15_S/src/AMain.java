
public class AMain {
	public static void main(String[] args) {
		
		int[] kor = { 100, 90, 30, 20, 50 };
		System.out.println(kor[1]);
		
		int[] mat = new int[3];
		mat[0] = 30;
		mat[1] = 50;
		mat[2] = 90;
		
		String[] name = new String[] {"홍길동", "김길동"};
		
		double[] height = {180.3, 170.5};
		
		//값에 접근 할 때는 : 변수명[인덱스]
		System.out.println( height[0]);
		System.out.println( height[1]);
		
		//몇 칸짜리인가 새는 거 : 변수명.length
		System.out.println(name.length);
		
		//이런식으로 하면 배열에 있는 것들을 차례대로 찍을 수 있다.
		//for 자동완성을 쓸 때 우리가 계속 지웠던 부분이 가장 가까운 배열을 불러오는 기능이었다.
		for (int i = 0; i < height.length; i++) {
			System.out.println(height[i]);
		System.out.println("---------");
		for (int j = 0; j < name.length; j++) {
			System.out.println(name[i]);
		}
		for (int j = 0; j < name.length; j++) {
			String t = name[i];
			System.out.println(t);
		}
		System.out.println("---------");
		
		for (String t : name) {
			System.out.println(t);
		}
		}
	}
}
