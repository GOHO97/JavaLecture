
public class AMain4 {
	public static void main(String[] args) {
		int v = 7;
		
		String[] spot = {"24시간", "와이파이", "주차장", "흡연실"};
		
		for (int i = spot.length - 1; i >= 0; i--) {
			if (v >= (1 << i)) {
				System.out.println(spot[i]);
				v -= (1 << i);
			}
		}
	
	}
}
