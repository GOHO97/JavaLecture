
public class OMain2 {
	public static void main(String[] args) {
		
		SM2 s = new SM2();
		s.cpu = "i7-1234";
		s.ram = 16;
		s.printInfo();
		
		SM2 s2 = new SM2();
		s2.cpu = "i5-3334";
		s2.ram = 8;
		s2.printInfo();
		
		SM2.showMaker();
	}
}
