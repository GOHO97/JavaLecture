
public class Insect {
	String kind;
	String name;
	Academy residence;
	
	public Insect() {
		// TODO Auto-generated constructor stub
	}
	
	public Insect(String kind, String name, Academy residence) {
		super();
		this.kind = kind;
		this.name = name;
		this.residence = residence;
	}
	
	public void printInfo() {
		System.out.println(kind);
		System.out.println(name);
		if (residence != null) {
			residence.printInfo();
		}
	}
	
}
