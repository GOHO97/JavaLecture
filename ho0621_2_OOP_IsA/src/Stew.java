
public class Stew extends Menu{
	String size;
	
	public Stew() {
		// TODO Auto-generated constructor stub
	}

	public Stew(String name, int price, String size) {
		super(name, price);
		this.size = size;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println(size);
	}
	
}
