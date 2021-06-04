package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Member;
import com.example.repository.MemberRepository;

@Controller
@RequestMapping("/member")
public class MemberController {
	@Autowired
	private MemberRepository repository;

	@RequestMapping("")
	public String index() {
		System.out.println("FindAll");
		System.out.println(repository.findAll());

		System.out.println("load(2)");
		System.out.println(repository.load(2));

		Member member = new Member("トマツ",23,2);
//		member.setName("トマツ");
	//	member.setAge(23);
		//member.setDepartmentId(2);

		System.out.println("save");
		System.out.println(repository.save(member));

		System.out.println("FindAll");
		System.out.println(repository.findAll());
		
		Member member2 = repository.load(2);
		member2.setName("シロー");
				
		System.out.println("save");
		System.out.println(repository.save(member2));
		
		System.out.println("FindAll");
		System.out.println(repository.findAll());
		
		return "member";
	}
}
