
public class OMain3 {
	
	public static void main(String[] args) {
		Gimbab g = new Gimbab("¾ßÃ¤±è¹ä", 4000);
		g.printInfo();
		System.out.println("------");
		
		Gimbab g2 = new Gimbab("±èÄ¡Âî°³", 5000);
		g2.printInfo();
		System.out.println("------");
		
		Gimbab g3 = new Gimbab();
		g3.name = "±èÄ¡ººÀ½¹ä";
		g3.printInfo();
		System.out.println("------");
		
		
	}
}
