package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex03")
public class Ex03Controller {
	@RequestMapping("showimage")
	public String showimage() {
		return "ex-03.html";
	}
	
}
