

public class Scanner extends Product{
	String electricity;
	
	public Scanner() {
		// TODO Auto-generated constructor stub
	}

	public Scanner(String name, int price, String electricity) {
		super(name, price);
		this.electricity = electricity;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println(electricity);
	}
}
