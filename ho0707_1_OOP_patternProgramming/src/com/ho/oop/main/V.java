package com.ho.oop.main;
import java.util.Scanner;

//View[디자이너] = 실제로 사용자에게 보여지는 파일[입력/출력]
// 콘솔창 -> 자바???
// 웹 -> 디자이너가 실제 작업 가능

public class V { // 콘솔창
	//콘솔창에 붙어있는
	//거기 있는 데이터 프로그램으로 가져올때 쓰는 빨대
	//의 서포터
	private Scanner strawSupporter; 
	
	public V() {
		strawSupporter = new Scanner(System.in);
	}
	
	public XY getXY() {
		System.out.print("x : ");
		int x = strawSupporter.nextInt();
		
		System.out.print("y : ");
		int y = strawSupporter.nextInt();
		
		return new XY(x, y); 
	}
	
	public void print(CalcResult cr) {
		System.out.println(cr.getA());
		System.out.println(cr.getB());
		System.out.println(cr.getC());
		System.out.println(cr.getD());
	}
	
	public void bye() {
		strawSupporter.close();
	}
}
