package com.example.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.User;

@Controller
@RequestMapping("/exbonus")
public class ExamBonusController {

	@Autowired
	private HttpSession session;
	
	@RequestMapping("")
	public String index() {
		return "exam-bonus-input";
	}
	
	@RequestMapping("/result")
	public String result(String email,String pass,Model model) {
		if(email.equals("yamada@sample.com") && pass.equals("yamayama")) {
			User user = new User();
			user.setName("山田太郎");
			user.setEmail(email);
			user.setAge(18);
			session.setAttribute("user", user);
			return "exam-bonus-result";
			
		}else {
			model.addAttribute("result","ログインに失敗しました");
			return "exam-bonus-input";
		
		}
		
	}
	
	
}
