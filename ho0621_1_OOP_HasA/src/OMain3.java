
public class OMain3 {
	public static void main(String[] args) {
		Student s = new Student("윤경호", 26);
		s.print();
		
		//학생은 다양한 여러명
		//그 여러명이 선생 하나를 공유 중(static)
		Student.teacher.teach("안드로이드");
		//시스템 또한 다양[win/ㅣinux/Mac)
		//콘솔창은 같이 씀.
		System.out.println("안드로이드");
		
		
	}
}
