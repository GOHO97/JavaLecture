
public class Dupbab extends Menu{
	String spicy;
	
	public Dupbab() {
		// TODO Auto-generated constructor stub
	}

	public Dupbab(String name, int price, String spicy) {
		super(name, price);
		this.spicy = spicy;
	}
	@Override
	public void print() {
		super.print();
		System.out.println(spicy);
	}
	
}
