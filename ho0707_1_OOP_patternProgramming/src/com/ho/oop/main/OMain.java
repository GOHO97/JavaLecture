package com.ho.oop.main;

import com.ho.oop.calculator.Calculator;

public class OMain {
	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		int a = c.input();
		int b = c.input();
		Calculator.hab(a, b);
		
	}
}
