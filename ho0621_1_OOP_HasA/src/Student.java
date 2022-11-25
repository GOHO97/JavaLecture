// 우리반 학생
public class Student {
	String name;
	int age;
	static Teacher teacher = new Teacher("권기웅", 35, "분당");
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void print() {
		System.out.println(name);
		System.out.println(age);
	}
}
