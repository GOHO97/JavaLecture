
public class OMain2 {
	public static void main(String[] args) {
		RandomPicker r = new RandomPicker();
		System.out.println("--------");
		
		Printer p = new Printer();
		p.name = "ĳ��123";
		p.price = 300000;
		p.showInfo();
		p.printName("ȫ�浿");
		
		Printer p2 = new Printer("ĳ��123", 300000);
		p2.showInfo();
		System.out.println("-----");
		
		Printer p3 = new Printer("��ä���", 4000);
		p3.showInfo();
		System.out.println("-----");
		
		
	}
}
