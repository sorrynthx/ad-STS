package com.dream.ad.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	@GetMapping("/")
	public String index() {
		return "html/index";
	}
	
	@GetMapping("/welcome/1")
	public String welcome1() {
		return "html/welcome1";
	}
	
	@GetMapping("/main")
	public String main() {
		return "html/main";
	}
	
}
