
public class Doctor {

	public void start() {
		Guest g = callGuest();
		ask(g);
		calculate(g);
		tellResult(g);
	}
	
	public Guest callGuest() {
		return new Guest();
	}
	
	public void ask(Guest g) {
		System.out.print("�̸� : ");
		g.tellName();
		System.out.print("Ű : ");
		g.tellHeight();
		if (g.height > 3) {
			g.height /= 100;
		}
		System.out.print("������ : ");
		g.tellWeight();
	}
	
	public void calculate(Guest g) {
		g.bmi = g.weight / (g.height * g.height);
		
		g.status = "��ü��";
		if (g.bmi >= 35) {
			g.status = "����";
		} else if (g.bmi >= 30) {
			g.status = "�ߵ���";
		} else if (g.bmi >= 25) {
			g.status = "�浵��";
		} else if (g.bmi >= 23) {
			g.status = "��ü��";
		} else if (g.bmi >= 18.5) {
			g.status = "����";
		} 
	}
	
	public void tellResult(Guest g) {
		System.out.printf("BMI : %.1f\n", g.bmi);
		System.out.printf("%s���� %s\n", g.name, g.status);
	}
	
}
