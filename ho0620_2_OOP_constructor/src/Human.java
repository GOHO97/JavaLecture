
public class Human {
	String name;
	int age;
	String home;
	
	public Human() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Human(String name, int age, String home) {
		super();
		this.name = name;
		this.age = age;
		this.home = home;
	}

	public void printInfo() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(home);
	}
	
}
