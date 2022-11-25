
public class SMain {
	public static void main(String[] args) {
		Selfintroduction Si = new Selfintroduction();
		Si.name = "윤경호";
		Si.age = 26;
		Si.sex = "남자";
		Si.cellphoneNum = "010-5219-8058";
		Si.address = "서울특별시 강서구";
		Si.printInfo();
		
		Selfintroduction Si2 = new Selfintroduction();
		Si2.name = "윤경호";
		Si2.age = 26;
		Si2.sex = "남자";
		Si2.cellphoneNum = "010-5219-8058";
		Si2.address = "서울특별시 강서구";
		Si2.printInfo();
		
		Selfintroduction Si3 = Si;
		Si3.printInfo();
		
		Si.name = "장준희";
		Si.age = 24;
		Si3.printInfo();
		
		Si = null;
	}
}
