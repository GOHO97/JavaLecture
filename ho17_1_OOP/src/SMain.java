
public class SMain {
	public static void main(String[] args) {
		Selfintroduction Si = new Selfintroduction();
		Si.name = "����ȣ";
		Si.age = 26;
		Si.sex = "����";
		Si.cellphoneNum = "010-5219-8058";
		Si.address = "����Ư���� ������";
		Si.printInfo();
		
		Selfintroduction Si2 = new Selfintroduction();
		Si2.name = "����ȣ";
		Si2.age = 26;
		Si2.sex = "����";
		Si2.cellphoneNum = "010-5219-8058";
		Si2.address = "����Ư���� ������";
		Si2.printInfo();
		
		Selfintroduction Si3 = Si;
		Si3.printInfo();
		
		Si.name = "������";
		Si.age = 24;
		Si3.printInfo();
		
		Si = null;
	}
}
