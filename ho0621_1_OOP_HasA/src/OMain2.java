
public class OMain2 {
	public static void main(String[] args) {
		
		Human h = new Human("홍길동", 40);
		h.prinInfo();
		System.out.println("-----");
		
		Company c = new Company("삼성", "수원", h);
		c.printInfo();
		System.out.println("------");
		
		Cpmputer p = new Cpmputer(c, "i7-1234", "16", "500");
		p.printInfo();
		System.out.println("------");
		
		Academy a = new Academy("솔데스크", "신논현역", p);
		a.printInfo();
		System.out.println("------");
		
		Insect i = new Insect("모기", "삼선모기", a);
		i.printInfo();
		System.out.println("------");
		
		//벌레 이름
		System.out.println(i.name);
		// 벌레가 사는 집 이름
		System.out.println(i.residence.name);
		//벌레 집 위치
		System.out.println(i.residence.area);
		//벌레 집 전체 정보
//		System.out.printf("%s, %s, %s\n", i.residence.name, i.residence.area, i.residence.server.manufacturer.name);
		i.residence.printInfo();
		//벌레 집의 서버 hdd 용량
		System.out.println(i.residence.server.hdd);
		//벌레 집 서버 전체 사양
//		System.out.printf("%s, %s, %s, %s\n", i.residence.server.manufacturer, i.residence.server.cpu, i.residence.server.ram, i.residence.server.hdd);
		i.residence.server.printInfo();
		//벌레 집 서버 만든 회사 이름
		System.out.println(i.residence.server.manufacturer.name);
		//벌레 집 서버 만든 회사 사장님 이름
		System.out.println(i.residence.server.manufacturer.ceo.name);
	}
}
