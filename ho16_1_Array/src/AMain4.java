
public class AMain4 {
	public static void main(String[] args) {
		int v = 7;
		
		String[] spot = {"24�ð�", "��������", "������", "����"};
		
		for (int i = spot.length - 1; i >= 0; i--) {
			if (v >= (1 << i)) {
				System.out.println(spot[i]);
				v -= (1 << i);
			}
		}
	
	}
}
