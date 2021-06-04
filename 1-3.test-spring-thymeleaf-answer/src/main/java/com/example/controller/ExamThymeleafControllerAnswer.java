package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.MemberAnswer;
import com.example.form.ExamThymeleafFormAnswer;

@Controller
@RequestMapping("/ex-thymeleaf")
public class ExamThymeleafControllerAnswer {
	
	@ModelAttribute
	public ExamThymeleafFormAnswer setUpForm() {
		return new ExamThymeleafFormAnswer();
	}
	
	@RequestMapping("")
	public String index(Model model) {
		return "ex-thymeleaf-input-answer";
	}
	
	@RequestMapping("/register")
	public String register(ExamThymeleafFormAnswer form, Model model) {
		MemberAnswer member = new MemberAnswer();
		
		member.setName(form.getName());
		
		member.setAge(Integer.parseInt(form.getAge()));
		
		List<String> hobbyList = new ArrayList<>();
		hobbyList.add(form.getHobby1());
		hobbyList.add(form.getHobby2());
		hobbyList.add(form.getHobby3());
		member.setHobbyList(hobbyList);
		
		model.addAttribute("member", member);
		
		return "ex-thymeleaf-result-answer";
	}
	
}
