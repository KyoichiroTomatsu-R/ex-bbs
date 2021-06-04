package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam01")
public class Exam01ControllerAnswer {

	@RequestMapping("")
	public String index() {
		return "exam-01-answer";
	}
	
	@RequestMapping("/login")
	public String login(String email, String password, Model model) {
		
		if("yamada@sample.com".equals(email) && "yamayama".equals(password)) {
			model.addAttribute("message", "成功");
		} else {
			model.addAttribute("message", "失敗");
		}
		return "exam-01-result-answer";
	}
}
