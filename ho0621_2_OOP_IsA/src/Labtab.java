
public class Labtab extends Computer{
	
	String weight;
	String batteryTime;
	
	
	@Override
	public void print() {
		super.print();
		System.out.println(weight);
		System.out.println(batteryTime);
	}
}
