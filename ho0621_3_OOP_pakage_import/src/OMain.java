import com.soldesk.ho.OOP.animal.Book;

public class OMain {
	public static void main(String[] args) {
		Chair c = new Chair("퍼시스123", 10000, "wheeless");
		c.print();
		System.out.println("------");
		
		Scanner s = new Scanner("캐논4324", 200000, "5등급");
		s.print();
		System.out.println("------");
		
		com.soldesk.ho.OOP.animal.Cat cc = new com.soldesk.ho.OOP.animal.Cat();
		com.soldesk.ho.OOP.animal.Book bb = new com.soldesk.ho.OOP.animal.Book();
		com.soldesk.ho.OOP.animal.Pig p = new com.soldesk.ho.OOP.animal.Pig();
		
		
	}
}
