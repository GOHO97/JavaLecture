
public class BoardMarker extends Product{
	// Product에 있는 멤버들(멤버변수/메소드)가 상속 되어옴.
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
