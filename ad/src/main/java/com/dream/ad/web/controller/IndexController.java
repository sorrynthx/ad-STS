package com.dream.ad.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	@GetMapping("/welcome")
	public String welcome() {
		return "contents/welcome";
	}
	
	@GetMapping("/landing")
	public String landing() {
		return "contents/landing";
	}
	
	@GetMapping("/seller")
	public String seller() {
		return "contents/seller";
	}
	
	@GetMapping("/marketer")
	public String marketer() {
		return "contents/marketer";
	}
}
