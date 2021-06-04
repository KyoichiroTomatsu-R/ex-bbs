package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.form.NumForm;

@Controller
@RequestMapping("/ex07")
public class Ex07Controller {

	
	@ModelAttribute
	public NumForm setUpForm() {
		return new NumForm();
	}
	
	@RequestMapping("")
	public String index() {
		return "ex-07.html";
	}

	@RequestMapping("/calc")
	public String calc(NumForm numForm) {
		int intNum1 = Integer.parseInt(numForm.getNum1());
		int intNum2 = Integer.parseInt(numForm.getNum2());

		System.out.println(intNum1 * intNum2);
		

		return "finished.html";
	}

}
