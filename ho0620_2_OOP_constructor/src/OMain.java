
public class OMain {
	public static void main(String[] args) {
		RandomPicker r = new RandomPicker();
		r.name = "점심 메뉴";
		r.price = 10000;
		r.pickerInfo();
		r.piker("대창덮밥","한솥", "중국집", "편의점");
		System.out.println("-------");
		
		RandomPicker r2 = new RandomPicker();
		r2.name = "회식 메뉴";
		r2.price = 12000;
		r2.pickerInfo();
		r.piker("치킨","피자", "삼겹살", "족발", "참치", "연어&육회");
		System.out.println("-------");
	}
}
