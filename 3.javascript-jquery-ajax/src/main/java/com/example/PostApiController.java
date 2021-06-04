package com.example;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/post")
public class PostApiController {
	
	@ResponseBody
	@RequestMapping(value="/post",method=RequestMethod.POST)
	public Map<String,String> change(String status,String message){
		Map<String,String> resultMap = new HashMap<>(); 
		Map<String,String> map = new HashMap<>(); 
		resultMap.put("入金前", "入金済み");
		resultMap.put("入金済み", "配送済み");
		resultMap.put("配送済み", "完了");
		resultMap.put("完了", "入金済み");
		resultMap.put("入金済へ変更", "配達済へ変更");
		resultMap.put("配達済へ変更", "完了へ変更");
		resultMap.put("完了へ変更", "入金前へ変更");
		resultMap.put("入金前へ変更", "入金済へ変更");
		
		String statsuMessage = null;
		String messageMessage = null;
		
		statsuMessage = resultMap.get(status);
		messageMessage = resultMap.get(message);
		
		map.put("status", statsuMessage);
		map.put("next", messageMessage);
		
		return map;
	}
}
