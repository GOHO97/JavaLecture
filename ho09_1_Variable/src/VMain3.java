
public class VMain3 {
	public static void main(String[] args) {
		String finedining = "���õ��";
		int restaurantTableCount = 15;
		double score = 3.5;
		boolean reservation = true;
		
		System.out.printf("�̸� : %s\n", finedining);
		System.out.printf("���̺� : %d�ڸ�\n", restaurantTableCount);
		System.out.printf("���̺� : %05d�ڸ�\n", restaurantTableCount);
		System.out.printf("���� : %f��\n", score);
		System.out.printf("���� : %.3f��\n", score);
		
		double humidity = 80.5;
		System.out.printf("���� : %.2f%%\n", humidity);
		
		String weather = "��";
		System.out.printf("����:%s, ����:%.0f", weather, humidity);
	}
}
