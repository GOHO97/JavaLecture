import java.util.Scanner;

public class CSMain2_1 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
//		System.out.print("��� : ");
//		String grade = k.next();
		System.out.print("���� : ");
		String role = k.next();
		
		switch (role) {
		case "DBA":
			System.out.println("��������\n���/����");
		case "DBP":
			System.out.println("CRUD(������ �ٷ��)");
		default:
			System.out.println("���� �̿�");
			break;
		}
		
		switch (grade) {
		case "�̺�":
			System.out.println("��ġ");
		case "�Ϻ�":
			System.out.println("�����");
		case "��":
			System.out.println("�Ʒ�");
		default:
			System.out.println("��");
			break;
			
			
		}
	}


