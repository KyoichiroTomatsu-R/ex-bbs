package com.example.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex02")
public class Ex02Controller {

	@RequestMapping("/show-kana-name")
	public String showkananame() {
		return "redirect:/ex02/showkananame2";
	}
	
	@RequestMapping("showkananame2")
	public String showkananame2() {
		return "ex-02.html";
	}
	
	
}
