import java.util.Scanner;

public class Guest {
	String name;
	double height;
	double weight;
	Scanner mouth = new Scanner(System.in);
	double bmi;
	String status;
	
	public void tellName() {
		name = mouth.next();
	}
	
	public void tellHeight() {
		height = mouth.nextDouble();
	}
	
	public void tellWeight() {
		weight = mouth.nextDouble();
	}
	
	
}
