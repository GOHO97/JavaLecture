
public class OMain2 {
	public static void main(String[] args) {
		Human h = new Human("홍길동", 30);
		h.print();
		System.out.println("------");
		
		Student s = new Student("최길동", 20, "강남고");
		s.print();
		System.out.println("------");
		
		Worker w = new Worker("박길동", 35, "삼성");
		w.print();
		System.out.println("------");
		
		Banjang b = new Banjang("제갈길동", 20, "서초고");
		b.print();
		System.out.println("------");
		
	}
}
