package com.example.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.User1;
import com.example.form.Ex10Form;

@Controller
@RequestMapping("/ex10")
public class Ex10Controller {

	@Autowired
	private HttpSession session;
	
	@Autowired
	private ServletContext application;
	
	@ModelAttribute
	public Ex10Form setUpForm() {
		return new Ex10Form();
	}
	
	
	@RequestMapping("")
	public String index() {
		return "ex-10-input.html";
	}
	
	@RequestMapping("in-put")
	public String input(Ex10Form exForm) {
		User1 user = new User1(exForm.getName(), exForm.getAge(), exForm.getComment());
		session.setAttribute("profile", user);
		application.setAttribute("approfile", user);
		return "ex-10-output.html";
	}

	@RequestMapping("/out-put")
	public String outPut() {
		
		return "ex-10-output.html";
	}
	@RequestMapping("/out-put2")
	public String outPut2() {
		return "ex-10-output2.html";
	}

}
