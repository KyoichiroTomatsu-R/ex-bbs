package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/password")
public class PasswordController {

	@RequestMapping("")
	public String index() {
		return "password";
	}
	
	
	
}
