package com.example;

public class MathUtil {

	public static double power(int num1,int num2) {
		
		if(num1 >= 100 || num2 >= 100) {
			throw new IllegalArgumentException("100ˆÈã‚Ì’l‚Í•s³‚Å‚·");
		}
		
		return Math.pow(num1, num2);
		
		
	}
	
	
}
