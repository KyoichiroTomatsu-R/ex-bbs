package com.example.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex02")
public class Exam02Controller {
	
	@Autowired
	private HttpSession session;
	
	
	@RequestMapping("")
	public String index() {
		return "exam02.html";
	}
	
	@RequestMapping("/calc")
	public String calc(String num1,String num2) {
		int ans = Integer.parseInt(num1) + Integer.parseInt(num2);
		session.setAttribute("num1", num1);
		session.setAttribute("num2", num2);
		session.setAttribute("ans", ans);
		
		return "exam02-result";
		
	}
	
	@RequestMapping("/result2")
	public String result2() {
		return "exam02-result2";
	}
	
}
