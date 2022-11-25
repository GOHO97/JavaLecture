
public class PrintTask {
	public static void main(String[] args) {
		System.out.println("*************************");
		System.out.println("* 이름\t: 윤경호\t\t*");
		System.out.println("* 집\t: 강서구\t\t*");
		System.out.println("* 전화번호\t: 010-3154-4435\t*");
		System.out.println("*************************");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
