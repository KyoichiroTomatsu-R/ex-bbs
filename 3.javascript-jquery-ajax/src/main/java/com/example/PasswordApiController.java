package com.example;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/password")
public class PasswordApiController {

	@ResponseBody
	@RequestMapping(value="/check",method=RequestMethod.POST)
	public Map<String,String> check(String password, String passwordConfirm){
		Map<String,String> map =new HashMap<>();
		String passwordMessage = null;
		String passwordConfirmMessage = null;
		
		if(password.length() < 8) {
			passwordMessage = "8文字以上にしてね";
		} else {
			passwordMessage = "パスワードOK";
		}
		
		if(!passwordConfirm.equals(password)) {
			passwordConfirmMessage = "不一致";
		} else {
			passwordConfirmMessage = "確認OK";			
		}
		
		map.put("passwordMessage", passwordMessage);
		map.put("passwordConfirmMessage", passwordConfirmMessage);
		
		return map;
	}
	
}
