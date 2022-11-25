
public class AMain3 {
	public static void main(String[] args) {
		int[][] score = {{100, 90, 80}, {80, 30, 50}, {30, 50, 10}};
		
		System.out.println(score); 
		System.out.println(score[0]);
		System.out.println(score[0][1]);
		
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.println(score[i][j]);
			}
		}
	}
}
