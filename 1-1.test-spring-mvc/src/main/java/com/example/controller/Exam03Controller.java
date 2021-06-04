package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.form.ReceiveNameForm;

@Controller
@RequestMapping("/exam03")
public class Exam03Controller {

	@RequestMapping("")
	public String index() {

		return "exam-03";
	}

	@RequestMapping("/receiveNameController")
	public String receiveNameController(String name) {
		System.out.println("入力された値は" + name + "です");
		return "finished";

	}

	@RequestMapping("/receiveFormController")
	public String receivFormController(ReceiveNameForm receivenameform) {
		System.out.println("入力された値は" + receivenameform.getName() + "です");
		return "finished";

	}

}
