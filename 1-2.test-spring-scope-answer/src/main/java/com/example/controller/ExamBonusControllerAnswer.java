package com.example.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.UserAnswer;

@Controller
@RequestMapping("/exam-bonus")
public class ExamBonusControllerAnswer {
	@Autowired
	private HttpSession session;
	
	@RequestMapping("")
	public String index() {
		return "exam-bonus-input-answer";
	}
	
	@RequestMapping("/login")
	public String login(String email, String password, Model model) {
		
		if("yamada@sample.com".equals(email) && "yamayama".equals(password)) {
			
			UserAnswer user = new UserAnswer();
			user.setName("山田太郎");
			user.setEmail("yamada@sample.com");
			user.setAge(18);
			session.setAttribute("user", user);
			
			return "exam-bonus-result-answer";
		} else {
			
			model.addAttribute("message", "ログインに失敗しました");
			
			// ログイン失敗のため、ログイン画面に戻る
			return "exam-bonus-input-answer";
		}
	}
	
	
}
