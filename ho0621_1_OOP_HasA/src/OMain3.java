
public class OMain3 {
	public static void main(String[] args) {
		Student s = new Student("����ȣ", 26);
		s.print();
		
		//�л��� �پ��� ������
		//�� �������� ���� �ϳ��� ���� ��(static)
		Student.teacher.teach("�ȵ���̵�");
		//�ý��� ���� �پ�[win/��inux/Mac)
		//�ܼ�â�� ���� ��.
		System.out.println("�ȵ���̵�");
		
		
	}
}
