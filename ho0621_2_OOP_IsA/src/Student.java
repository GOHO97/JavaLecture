
public class Student extends Human{
	String school;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name, int age, String school) {
		super(name, age);
		this.school = school;
	}



	@Override
	public void print() {
		super.print();
		System.out.println(school);
	}
}
