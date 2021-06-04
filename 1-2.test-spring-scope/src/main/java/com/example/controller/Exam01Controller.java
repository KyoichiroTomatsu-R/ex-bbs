package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex01")
public class Exam01Controller {
	
	@RequestMapping("")
	public String index() {
		return "exam01";
	}

	@RequestMapping("/recieve")
	public String recieve(String email,String pass, Model model) {
		if(email.equals("yamada@sample.com") && pass.equals("yamayama")) {
			model.addAttribute("result", "成功");
		}else {
			model.addAttribute("result", "失敗");
		}
		return "exam-result";
	}
	
}
