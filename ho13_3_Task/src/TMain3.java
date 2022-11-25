import java.util.Scanner;

public class TMain3 {
	
	public static String getSubjectName() {
		Scanner k = new Scanner(System.in);
		System.out.print("����� : ");
		String subjectName = k.next();
		return subjectName;
	}
	
	public static double getMidScore() {
		Scanner k = new Scanner(System.in);
		System.out.print("�߰���� : ");
		double midScore = k.nextDouble();
		return (midScore < 0 || midScore > 100) ? getMidScore() : midScore;
	}

	public static double getFinScore() {
		Scanner k = new Scanner(System.in);
		System.out.print("�⸻��� : ");
		double finScore = k.nextDouble();
		return (finScore < 0 || finScore > 100) ? getFinScore() : finScore;
	}
	
	public static double getAvg(double m, double f) {
		return (m + f) / 2.0;
	}
	
	public static String evaluation(double avg) {
		if (avg >= 90) {
			return "��";
		} else if(avg >= 80) {
			return "��";
		} else if(avg >= 70) {
			return "��";
		} else if(avg >= 60) {
			return "��";
		}
		return "��";
	}
	
	public static void showResult(String subjectName, double avg, String result) {
		System.out.printf("��� : %.1f��\n", avg);
		System.out.printf("%s�� %s\n", subjectName, result);
		
	}
	
	public static void main(String[] args) {
		String subjectName = getSubjectName();
		double midScore = getMidScore();
		double finScore = getFinScore();
		System.out.println("----------------------");
		double avg = getAvg(midScore, finScore);
		String result = evaluation(avg);
		showResult(subjectName, avg, result);
	}
}
