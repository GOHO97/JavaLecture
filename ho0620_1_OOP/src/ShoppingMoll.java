
public class ShoppingMoll {
	
	String kind;
	String productName;
	int price;
	double weight;
	static String producer = "�����";
	
	
	public void printInfo() {
		System.out.println(kind);
		System.out.println(productName);
		System.out.printf("%d��\n", price);
	}
	public void printInfo2() {
		System.out.println(kind);
		System.out.println(productName);
		System.out.printf("%d��\n", price);
		System.out.printf("%.1fkg\n", weight);
		System.out.println(producer);
	}
	
}
