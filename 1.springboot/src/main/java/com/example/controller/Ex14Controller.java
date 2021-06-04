package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex14")

public class Ex14Controller {

	@RequestMapping("")
	public String index(Model model) {
		List<String> list = new ArrayList<>();

		list.add("山田");
		list.add("鈴木");
		list.add("伊藤");
		list.add("吉田");
		list.add("佐藤");
		model.addAttribute("list",list);

		return "ex-14";

	}
}
