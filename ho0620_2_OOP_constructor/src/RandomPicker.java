import java.util.Random;

public class RandomPicker {
	static String productName = "����̱���";
	String name;
	int price;
	static String developerName = "����ȣ";
	Random engine;
	
	public RandomPicker() {
		engine = new Random();
	}
	
	public void pickerInfo() {
		System.out.println(productName);
		System.out.println(name);
		System.out.println(price);
		System.out.println(developerName);
	}
	
	public void piker(String ...v) {
		Random p = new Random();
		int num = p.nextInt(v.length);
		System.out.printf("%s�� ��� : %s\n", name, v[num]);
		
	}
	
}
