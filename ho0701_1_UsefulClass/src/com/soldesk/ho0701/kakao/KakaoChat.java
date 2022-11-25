package com.soldesk.ho0701.kakao;

public class KakaoChat {
	private String word;
	private int count;
	
	public KakaoChat() {
		// TODO Auto-generated constructor stub
	}
	

	public KakaoChat(String word, int count) {
		super();
		this.word = word;
		this.count = count;
	}


	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public void show() {
		System.out.printf("%s : %d\n", word, count);
	}
}