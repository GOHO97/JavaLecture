
public class OMain {
	public static void main(String[] args) {
		
		Product p = new Product();
		p.name = "텀블러";
		p.price = 23000;
		p.print();
		System.out.println("-----");
		
		BoardMarker bm = new BoardMarker();
		bm.name = "모나미보드마카";
		bm.price = 1000;
		bm.color = "빨강";
		bm.print();
		System.out.println("-----");
		
		Shoes s = new Shoes();
		s.name = "삼선슬리퍼";
		s.price = 2000;
		s.size = "M";
		s.nation = "중국산";
		s.print();
		System.out.println("-----");
		
		Computer c = new Computer();
		c.name = "탱고12312";
		c.price = 300000;
		c.cpu = "i7-1234";
		c.ram = "16GB";
		c.hdd = "500GB";
		c.print();
		System.out.println("-----");
		
		Labtab l = new Labtab();
		l.name = "그램12312";
		l.price = 2000000;
		l.cpu = "i7-4564";
		l.ram = "8GB";
		l.hdd = "250GB";
		l.weight = "3kg";
		l.batteryTime = "2시간";
		l.print();
		System.out.println("-----");
	}
}
