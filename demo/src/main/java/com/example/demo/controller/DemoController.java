package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
	
	@RequestMapping(value = "/")
	public String demo(){
		return "hello";
	}
	
}
