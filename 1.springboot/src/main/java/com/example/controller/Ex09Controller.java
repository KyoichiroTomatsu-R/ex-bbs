package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/ex09")

public class Ex09Controller {

	@RequestMapping("")
	public String index() {
		return "ex-09.html";
	}
	@RequestMapping("login")
	public String login(String email,String pass,Model model) {
		if(email.equals("abc@gmail.com") && pass.equals("abc")) {
			model.addAttribute("result","成功");
		}else {
			model.addAttribute("result","失敗");
		}
		return "ex-09-result";
	}
	
}
