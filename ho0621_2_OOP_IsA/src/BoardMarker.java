
public class BoardMarker extends Product{
	// Product�� �ִ� �����(�������/�޼ҵ�)�� ��� �Ǿ��.
	String color;
	
//	public void print() {
//		System.out.println(name);
//		System.out.println(price);
//		System.out.println(color);
//	}
	
	@Override
	public void print() {
		super.print();
		System.out.println(color);
	}
}
