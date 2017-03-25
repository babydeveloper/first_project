package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
	
	private Logger logger = LoggerFactory.getLogger(DemoController.class);
	
	@RequestMapping(value = "/")
	public String demo(Model model){
		logger.info("[/] request enter!!");
		model.addAttribute("name", "Hello springboot!!!!");
		return "demo/hello";
	}
	
	@RequestMapping(value = "/about")
	public String getModelData(Model model){
		model.addAttribute("name", "Hello springboot!!!!");
		return "demo/about";
	}
	
}
