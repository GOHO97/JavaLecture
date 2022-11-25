
public class OMain2 {
	public static void main(String[] args) {
		RandomPicker r = new RandomPicker();
		System.out.println("--------");
		
		Printer p = new Printer();
		p.name = "Ä³³í123";
		p.price = 300000;
		p.showInfo();
		p.printName("È«±æµ¿");
		
		Printer p2 = new Printer("Ä³³í123", 300000);
		p2.showInfo();
		System.out.println("-----");
		
		Printer p3 = new Printer("¾ßÃ¤±è¹ä", 4000);
		p3.showInfo();
		System.out.println("-----");
		
		
	}
}
