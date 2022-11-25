
public class Chair extends Product{
	String wheel;
	
	public Chair() {
		// TODO Auto-generated constructor stub
	}

	public Chair(String name, int price, String wheel) {
		super(name, price);
		this.wheel = wheel;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println(wheel);
	}
}
