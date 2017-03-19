package com.everykura.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class EveryKuraController {

	@RequestMapping(method = RequestMethod.GET)
	public String helloEveryKura(ModelMap model){
		model.addAttribute("greeting", "Hello World from Pash");
		return "welcome";
	}
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String welcomeToEveryKura(ModelMap model){
		model.addAttribute("greeting", "Hello World from Pash");
		return "welcome";
	}
	
	@RequestMapping(value = "/name", method = RequestMethod.GET)
	public String name(){
		String name = "John Doe";
		return name;
	}
}
