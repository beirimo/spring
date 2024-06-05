package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	//홈페이지 출력
	@GetMapping("/")
	public String home() {
		//리턴하고자 하는 이름을 넣어주는거
		return "/home.html";
	}
	
}
