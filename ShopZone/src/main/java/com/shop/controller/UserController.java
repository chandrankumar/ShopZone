package com.shop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value="/shopzone")
@RestController
public class UserController {

	
	
	@GetMapping("/home")
	public String home() {
		return "index";
	}
	
}
