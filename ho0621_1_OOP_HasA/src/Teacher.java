
public class Teacher {
	String name;
	int age;
	String home;
	
	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	public Teacher(String name, int age, String home) {
		super();
		this.name = name;
		this.age = age;
		this.home = home;
	}
	
	public void teach(String subject) {
		System.out.println(subject + "란 말입니다....");
	}
	
	public void print() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(home);
	}
}
