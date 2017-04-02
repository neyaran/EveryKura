package com.everykura.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EveryKuraController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String helloEveryKura(){
		return "Hello EveryKura";
	}
}
