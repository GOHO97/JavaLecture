
public class Worker extends Human{
	String companyName;
	
	public Worker() {
	}

	public Worker(String name, int age, String companyName) {
		super(name, age);
		this.companyName = companyName;
	}
	@Override
	public void print() {
		super.print();
		System.out.println(companyName);
	}
}
