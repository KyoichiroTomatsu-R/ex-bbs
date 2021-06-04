package com.example.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Member;

@Controller
@RequestMapping("/ex2")
public class ExamThymeleafController {

	@RequestMapping("")
	public String index() {
		return "ex-thymeleaf-input"; 
	}
	
	@RequestMapping("/result")
	public String result(String name, Integer age,String hobby1 ,String hobby2,String hobby3,Model model) {
		
		Member member = new Member();
		List<String> list = new ArrayList<>();
		
		list.add(hobby1);
		list.add(hobby2);
		list.add(hobby3);
		
		
		member.setName(name);
		member.setAge(age);
		member.setHobbyList(list);
		
		model.addAttribute("user", member);
		
		return "ex-thymeleaf-result";
	}
	
	
}
