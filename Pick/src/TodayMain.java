import java.util.Random;

public class TodayMain {
	public static void main(String[] args) throws InterruptedException {
		String[] ar = {"��â����", "�ʹ�", "�δ��",
				"�Һ�", "����", "�߽�", "��������", 
				"�޲ٹ�����", "�������"};
		
		Random r = new Random();
		
		for (int i = 0; i < 10; i++) {
			System.out.println(ar[r.nextInt(ar.length)]);
			Thread.sleep(700);
		}
	}
}
