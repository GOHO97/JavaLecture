
public class OMain {
	public static void main(String[] args) {
		
		Product p = new Product();
		p.name = "�Һ�";
		p.price = 23000;
		p.print();
		System.out.println("-----");
		
		BoardMarker bm = new BoardMarker();
		bm.name = "�𳪹̺��帶ī";
		bm.price = 1000;
		bm.color = "����";
		bm.print();
		System.out.println("-----");
		
		Shoes s = new Shoes();
		s.name = "�Ｑ������";
		s.price = 2000;
		s.size = "M";
		s.nation = "�߱���";
		s.print();
		System.out.println("-----");
		
		Computer c = new Computer();
		c.name = "�ʰ�12312";
		c.price = 300000;
		c.cpu = "i7-1234";
		c.ram = "16GB";
		c.hdd = "500GB";
		c.print();
		System.out.println("-----");
		
		Labtab l = new Labtab();
		l.name = "�׷�12312";
		l.price = 2000000;
		l.cpu = "i7-4564";
		l.ram = "8GB";
		l.hdd = "250GB";
		l.weight = "3kg";
		l.batteryTime = "2�ð�";
		l.print();
		System.out.println("-----");
	}
}
