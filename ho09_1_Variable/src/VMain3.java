
public class VMain3 {
	public static void main(String[] args) {
		String finedining = "김밥천국";
		int restaurantTableCount = 15;
		double score = 3.5;
		boolean reservation = true;
		
		System.out.printf("이름 : %s\n", finedining);
		System.out.printf("테이블 : %d자리\n", restaurantTableCount);
		System.out.printf("테이블 : %05d자리\n", restaurantTableCount);
		System.out.printf("별점 : %f점\n", score);
		System.out.printf("별점 : %.3f점\n", score);
		
		double humidity = 80.5;
		System.out.printf("습도 : %.2f%%\n", humidity);
		
		String weather = "비";
		System.out.printf("날씨:%s, 습도:%.0f", weather, humidity);
	}
}
