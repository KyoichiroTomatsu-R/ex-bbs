package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex04")
public class Ex04Contoller {
	
	@RequestMapping("")
	public String index() {
		return "ex-04.html";
	}
	
	@RequestMapping("Ex04Controller")
	public String Ex04Contorller(String email,String pass) {
		if(email.equals("abc@gmail.com") && pass.equals("abc")) {
			return "ex-04-success.html";
		}else {
			System.out.println("email=" + email + " pass=" + pass);
			return "ex-04-failure.html";
		}
	}
}
