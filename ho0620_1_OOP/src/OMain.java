
public class OMain {
	public static void main(String[] args) {
		ShoppingMoll sM = new ShoppingMoll();
		sM.kind = "mouse";
		sM.productName = "logitec123";
		sM.price = 10000;
		sM.printInfo();
		System.out.println("------");
		
		ShoppingMoll sM2 = new ShoppingMoll();
		sM2.kind = "mouse";
		sM2.productName = "Samsung456";
		sM2.price = 12000;
		sM2.printInfo();
		System.out.println("------");
		
		ShoppingMoll sM3 = new ShoppingMoll();
		sM3.kind = "pickledCrab";
		sM3.productName = "pickledCrabWithSoySauceSet";
		sM3.price = 39900;
		sM3.weight = 3.5;
		sM3.printInfo2();
		System.out.println("------");
		
		ShoppingMoll sM4 = new ShoppingMoll();
		sM4.kind = "pickledCrab";
		sM4.productName = "pickledCrabWithSoySaucePremiumSet";
		sM4.price = 139900;
		sM4.weight = 13.5;
		sM4.printInfo2();
		System.out.println("------");
	}
}
