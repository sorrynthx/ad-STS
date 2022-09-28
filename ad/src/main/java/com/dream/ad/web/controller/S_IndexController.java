package com.dream.ad.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/seller")
@Controller
public class S_IndexController {
	
	@GetMapping("/main")
	public String main(Model model) {
		model.addAttribute("type", "seller");
		model.addAttribute("title", "매출 상승을 위한 서비스");
		model.addAttribute("description", "셀러 - 메뉴1");
		return "contents/seller/main";
	}
	
	@GetMapping("/main2")
	public String main2(Model model) {
		model.addAttribute("type", "seller");
		model.addAttribute("title", "seller2 입니다.");
		model.addAttribute("description", "seller2 설명입니다.");
		return "contents/seller/main2";
	}
	
}
