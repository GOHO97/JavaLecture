
public class Academy {
	String name;
	String area;
	Cpmputer server;
	
	public Academy() {
		// TODO Auto-generated constructor stub
	}

	
	
	public Academy(String name, String area, Cpmputer server) {
		super();
		this.name = name;
		this.area = area;
		this.server = server;
	}



	public void printInfo() {
		System.out.println(name);
		System.out.println(area);
		if (server != null) {
			server.printInfo();
		}
	}
}
