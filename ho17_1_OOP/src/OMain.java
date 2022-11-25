
public class OMain {
	
	public static void dogName() {
		System.out.println("∏∏µÊ¿Ã");
	}
	
	public static void dogAge() {
		System.out.println("3ªÏ");
	}
	
	public static void main(String[] args) {
		
		dogName();
		dogAge();
		
		Dog d = new Dog();
		d.name = "∏∏µÊ¿Ã";
		d.age = 3;
		d.bark();
		d.printInfo();
		
		Computer c = new Computer();
		c.cpu = "i7-1234";
		c.ram = 16;
		c.hdd = 500;
		c.printInfo();
		
	}
}
