package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Member;

@Controller
@RequestMapping("/ex12")
public class Ex12Controller {


	
	@RequestMapping("")
	public String index() {
		return "ex-12-register-member";
	}

	@RequestMapping("/receive")
	public String receive(String name,Integer age,Integer money,String comment,Model model) {
		Member member = new Member();
		member.setName(name);
		member.setAge(age);
		member.setMoney(money);
		member.setComment(comment);
		
		model.addAttribute(member);
		
		return "ex-12-register-member-output";
		
		
	}
}
