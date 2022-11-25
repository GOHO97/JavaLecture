
//여기는 왜 안 쓰나 : 에러
public class OMain {
	// 여기는 왜
	public static void main(String[] args) {
		//여기는 왜 : JVM이 OMain.main을 가장 먼저 실행하기 때문에
		Dog d = new Dog("철수", 3);
		d.printInfo();
		System.out.println("-----");
		
		Human h = new Human("홍길동", 30);
		h.pet = d;
		h.prinInfo();
		System.out.println("-----");
		
		Human h2 = new Human("김길동", 20);
		h2.prinInfo();
		System.out.println("-----");
		
		Human h3 = new Human("홍판서", 60, d);
		h3.prinInfo();
		System.out.println("-----");
		
	}
}
