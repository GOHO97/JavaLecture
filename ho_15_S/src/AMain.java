
public class AMain {
	public static void main(String[] args) {
		
		int[] kor = { 100, 90, 30, 20, 50 };
		System.out.println(kor[1]);
		
		int[] mat = new int[3];
		mat[0] = 30;
		mat[1] = 50;
		mat[2] = 90;
		
		String[] name = new String[] {"ȫ�浿", "��浿"};
		
		double[] height = {180.3, 170.5};
		
		//���� ���� �� ���� : ������[�ε���]
		System.out.println( height[0]);
		System.out.println( height[1]);
		
		//�� ĭ¥���ΰ� ���� �� : ������.length
		System.out.println(name.length);
		
		//�̷������� �ϸ� �迭�� �ִ� �͵��� ���ʴ�� ���� �� �ִ�.
		//for �ڵ��ϼ��� �� �� �츮�� ��� ������ �κ��� ���� ����� �迭�� �ҷ����� ����̾���.
		for (int i = 0; i < height.length; i++) {
			System.out.println(height[i]);
		System.out.println("---------");
		for (int j = 0; j < name.length; j++) {
			System.out.println(name[i]);
		}
		for (int j = 0; j < name.length; j++) {
			String t = name[i];
			System.out.println(t);
		}
		System.out.println("---------");
		
		for (String t : name) {
			System.out.println(t);
		}
		}
	}
}
