
public class Company {
	String name;
	String address;
	Human ceo;
	
	public Company() {
		// TODO Auto-generated constructor stub
	}

	public Company(String name, String area, Human ceo) {
		super();
		this.name = name;
		this.address = area;
		this.ceo = ceo;
	}
	
	public void printInfo() {
		System.out.printf("����� : %s\n", name);
		System.out.printf("���� ��ġ : %s\n", address);
		if (ceo != null) {
			ceo.prinInfo();
		}
		
	}
}
