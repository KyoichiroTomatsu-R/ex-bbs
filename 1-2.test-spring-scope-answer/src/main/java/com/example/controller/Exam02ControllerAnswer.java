package com.example.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam02")
public class Exam02ControllerAnswer {
	@Autowired
	private HttpSession session;
	
	@RequestMapping("")
	public String index() {
		return "exam-02-answer";
	}
	
	@RequestMapping("/addition")
	public String addition(Integer num1, Integer num2) {
		session.setAttribute("num1", num1);
		session.setAttribute("num2", num2);
		session.setAttribute("answer", num1 + num2);
		return "exam-02-result-answer";
	}
	
	@RequestMapping("/toNextPage")
	public String toNextPage() {
		return "exam-02-result2-answer";
	}
	
}
