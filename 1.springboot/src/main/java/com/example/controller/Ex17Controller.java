package com.example.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex17")

public class Ex17Controller {
	@RequestMapping("")
	public String index(Model model) {
		Map<Integer,String> genderMap = new LinkedHashMap<>();
		genderMap.put(1, "男");
		genderMap.put(2, "女");
		model.addAttribute("genderMap", genderMap);
		
		
		
		
		return "ex-17-input";
	}
	
}
