// �츮�� �л�
public class Student {
	String name;
	int age;
	static Teacher teacher = new Teacher("�Ǳ��", 35, "�д�");
	
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
