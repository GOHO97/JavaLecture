
public class CSMain {
	public static void main(String[] args) {
		int v = 13;
		
		if(v >= (1 << 3)) {
			System.out.println("����");
			v -= (1 << 3);
		}
		if (v >= (1 << 2)) {
			System.out.println("������");
			v -= (1 << 2);
		}
		if (v >= (1 << 1)) {
			System.out.println("��������");
			v -= (1 << 1);
		}
		if (v >= (1 << 0)) {
			System.out.println("24�ð�");
			v -= (1 << 0);
		}
	}
}
