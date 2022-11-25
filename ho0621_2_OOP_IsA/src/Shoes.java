
public class Shoes extends Product{
	String size;
	String nation;
	
	@Override
	public void print() {
		super.print();
		System.out.println(size);
		System.out.println(nation);
	}
}
