package com.soldesk.ho0630.collection.student;

public class Student {
	private String name;
	private int kor;
	private int eng;
	private int meth;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Student(String name, int kor, int eng, int meth) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.meth = meth;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMeth() {
		return meth;
	}

	public void setMeth(int meth) {
		this.meth = meth;
	}
	
	public void printInfo() {
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(meth);
	}
}
