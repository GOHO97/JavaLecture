
public class SM2 {
	static String kind = "��ǻ��";
	static final String MAKER = "�Ｚ";
	String cpu;
	int ram;
	
	
	public void printInfo() {
		System.out.println(kind);
		System.out.println(cpu);
		System.out.printf("%dGB\n", ram);
		System.out.println(MAKER);
		System.out.println("--------");
	}
		
	public static void showMaker() {
		System.out.println("������");
	}
	
}
