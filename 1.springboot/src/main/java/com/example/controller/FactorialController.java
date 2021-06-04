package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.service.FactorialService;

@Controller
@RequestMapping("/ex22")
public class FactorialController {

	@Autowired
	FactorialService factorialService;
	@RequestMapping("")
	public String index(Model model) {
		int ans = factorialService.getFactorial(6);
		model.addAttribute("ans", ans);
		return "ex-22";
	}
	
}
