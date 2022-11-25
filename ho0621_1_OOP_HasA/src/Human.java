
public class Human {
	String name;
	int age;
	static String residence = "Áö±¸";
	Dog pet;
	Company job;
	
	public Human() {
		// TODO Auto-generated constructor stub
	}

	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public Human(String name, int age, Dog pet) {
		super();
		this.name = name;
		this.age = age;
		this.pet = pet;
	}

	public void prinInfo() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(residence);
		if (pet != null) {
			pet.printInfo();
		}
		if (job != null) {
			job.printInfo();
		}
	}
}
