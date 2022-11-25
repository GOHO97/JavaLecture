
public class Cpmputer {
	Company manufacturer;
	String cpu;
	String ram;
	String hdd;
	
	public Cpmputer() {
		// TODO Auto-generated constructor stub
	}

	
	public Cpmputer(Company manufacturer, String cpu, String ram, String hdd) {
		super();
		this.manufacturer = manufacturer;
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
	}



	public void printInfo() {
		if (manufacturer != null) {
			manufacturer.printInfo();
		}
		System.out.println(cpu);
		System.out.println(ram);
		System.out.println(hdd);
	}
}
