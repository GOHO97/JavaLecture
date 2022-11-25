
public class Alcohol extends Menu{
	int alcohol;
	
	public Alcohol() {
		// TODO Auto-generated constructor stub
	}

	public Alcohol(String name, int price, int alcohol) {
		super(name, price);
		this.alcohol = alcohol;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println(alcohol);
	}
}
