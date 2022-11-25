import java.util.Scanner;

public class CSMain2_1 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
//		System.out.print("계급 : ");
//		String grade = k.next();
		System.out.print("역할 : ");
		String role = k.next();
		
		switch (role) {
		case "DBA":
			System.out.println("전원관리\n백업/복구");
		case "DBP":
			System.out.println("CRUD(데이터 다루기)");
		default:
			System.out.println("서비스 이용");
			break;
		}
		
		switch (grade) {
		case "이병":
			System.out.println("눈치");
		case "일병":
			System.out.println("관등성명");
		case "상병":
			System.out.println("훈련");
		default:
			System.out.println("잠");
			break;
			
			
		}
	}


