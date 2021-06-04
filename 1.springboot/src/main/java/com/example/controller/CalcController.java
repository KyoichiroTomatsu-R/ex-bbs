package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.service.CalcService;

@Controller
public class CalcController {
	@Autowired
	private CalcService calcService;
	
	@RequestMapping("/add")
	public String add() {
		int num1 = 2;
		int num2 = 3;
		
		int resultOfAdd = calcService.add(num1, num2);
		System.out.println(num1 + "+" + num2 + "="  + resultOfAdd);
		return "finished1";
	}

	@RequestMapping("/sub")
	public String sub() {
		int num1 = 2;
		int num2 = 3;
		
		int resultOfsub = calcService.sub(num1, num2);
		System.out.println(num1 + "-" + num2 + "="  + resultOfsub);
		return "finished1";
	}
	
	@RequestMapping("/multi")
	public String multi() {
		int num1 = 2;
		int num2 = 3;
		
		int resultOfmulti = calcService.multi(num1, num2);
		System.out.println(num1 + "*" + num2 + "="  + resultOfmulti);
		return "finished1";
	}
	
	@RequestMapping("/div")
	public String div() {
		int num1 = 6;
		int num2 = 2;
		
		int resultOfdiv = calcService.div(num1, num2);
		System.out.println(num1 + "/" + num2 + "="  + resultOfdiv);
		return "finished1";
	}
	
	
	
}
