package com.ho.last.main;

import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleScreen {
	private Scanner input;
	
	public ConsoleScreen() {
		input = new Scanner(System.in);
	}
	
	public int printList() {
		System.out.println("1. 매장등록");
		System.out.println("2. 메뉴등록");
		System.out.println("3. 매장조회");
		System.out.println("4. 메뉴조회");
		System.out.println("5. 메뉴 페이지 단위로 조회");
		System.out.println("10. 종료");
		System.out.println("--------");
		System.out.print("뭐 : ");
		int pick = input.nextInt();
		return (pick > 5 && pick < 1) ? printList() : pick;
	}
	
	public ShopInfo getInfo() {
		System.out.print("매장이름 : ");
		String s_name = input.next();
		System.out.print("번호 : ");
		String s_call = input.next();
		
		return new ShopInfo(s_name, s_call);
	}

	public MenuInfo getMInfo() {
		System.out.print("메뉴이름 : ");
		String m_name = input.next();
		System.out.print("메뉴가격 : ");
		int m_price = input.nextInt();
		System.out.print("매장이름 : ");
		String m_s_name = input.next();
		
		return new MenuInfo(m_name, m_price, m_s_name);
	}
	
	public int getPageNum() {
		System.out.println("페이지 입력 : ");
		int pageNum = input.nextInt();
		return pageNum;
	}
	
	public void print(ArrayList<MenuInfo> result) {
		
		for (MenuInfo menuInfo : result) {
			System.out.println(menuInfo.getM_name());
			System.out.println(menuInfo.getM_price());
			System.out.println(menuInfo.getM_s_name());
		}
	}
	
	public void printResult(String r) {
		System.out.println(r);
	}
	
	public void closeCs() {
		input.close();
	}
}
