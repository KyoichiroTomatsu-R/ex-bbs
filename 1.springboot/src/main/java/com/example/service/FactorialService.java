package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class FactorialService {

	public int getFactorial(int num) {
		int ans = 1;
		for(int i = 1;i <= num;i++) {
			ans *= i;
		}
		return ans;
	}
	
}
