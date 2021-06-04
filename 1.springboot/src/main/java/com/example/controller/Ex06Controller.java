package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.form.ProfileForm;


@Controller
@RequestMapping("/ex06")
public class Ex06Controller {

	@ModelAttribute
	public ProfileForm setUpForm() {
		return new ProfileForm();
		
	}

	@RequestMapping("")
	public String index() {
		return "ex-06.html";
	}

	@RequestMapping("/receive-info")
	public String receiveInfo(ProfileForm profileForm) {
		System.out.println(profileForm.getName());
		System.out.println(profileForm.getAge());
		System.out.println(profileForm.getComment());

		return "finished";
	}
}
