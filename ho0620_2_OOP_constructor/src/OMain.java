
public class OMain {
	public static void main(String[] args) {
		RandomPicker r = new RandomPicker();
		r.name = "���� �޴�";
		r.price = 10000;
		r.pickerInfo();
		r.piker("��â����","�Ѽ�", "�߱���", "������");
		System.out.println("-------");
		
		RandomPicker r2 = new RandomPicker();
		r2.name = "ȸ�� �޴�";
		r2.price = 12000;
		r2.pickerInfo();
		r.piker("ġŲ","����", "����", "����", "��ġ", "����&��ȸ");
		System.out.println("-------");
	}
}
