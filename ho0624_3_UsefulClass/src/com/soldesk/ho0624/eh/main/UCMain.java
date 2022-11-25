package com.soldesk.ho0624.eh.main;

import java.util.StringTokenizer;

public class UCMain {
	public static void main(String[] args) {
		String s = new String("아 원장님 올 때 지갑은 두껍게");
		
		System.out.println(s.charAt(2));
		//껍자는 몇번째에
		System.out.println(s.indexOf("껍"));
		//전체 글자수?
		System.out.println(s.length());
		//두껍게로 끝나나
		System.out.println(s.endsWith("두껍게"));
		//원장님 -> 부장님
		System.out.println(s.replace("원장님", "부장님"));
		//2~5 번째 글자만
		System.out.println(s.substring(3, 6));
		
		String ss = String.format("%d", 10);
		System.out.println(ss);
		
		String s2;
		for (int i = 1; i < 13; i++) {
			s2 = String.format("hero_kick_%02d.png", i);
			System.out.println(s2);
		}
		
		// 아까 s 뒤에 부장님도 추가 를 넣어라
		System.out.println(s.concat(" 부장님도 추가"));
		
		StringBuffer sb = new StringBuffer("ㅋㅋㅋ");
		sb.append("ㅎㅎㅎ");
		System.out.println(sb);
		
		String data = "맑음, 30, 80, 동"; //정형 데이터
		String[] dd = data.split(",");
		System.out.println(dd[1]);
		
		String data2 = "누나 나 먼저 집에 간다."; //비정형 데이터
		StringTokenizer st = new StringTokenizer(data2, " ");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		
		
	}
}
