package com.dream.ad.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/marketer")
@Controller
public class M_IndexController {
	
	@GetMapping("/main")
	public String main(Model model) {
		model.addAttribute("type", "marketer");
		model.addAttribute("title", "marketer1 입니다.");
		model.addAttribute("description", "marketer1 설명입니다.");
		return "contents/marketer/main";
	}
	
	@GetMapping("/main2")
	public String main2(Model model) {
		model.addAttribute("type", "marketer");
		model.addAttribute("title", "marketer2 입니다.");
		model.addAttribute("description", "marketer2 설명입니다.");
		return "contents/marketer/main2";
	}
	
}
