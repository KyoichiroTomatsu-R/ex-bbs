package com.example;

public class ExerciseMath {

	public static int factorial(int num) {
		if(num <= 0 || num >= 13) {
			throw new IllegalArgumentException("“n‚³‚ê‚½’l‚ª³‚µ‚­‚ ‚è‚Ü‚¹‚ñ");
		}
		
		int ans = 1;
		for (int i = 1; i <= num; i++) {
			ans *= i;
		}

		return ans;
	}

}
