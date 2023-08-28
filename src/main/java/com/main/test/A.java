package com.main.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

@RestController
public class A {
	
	@GetMapping("/{name}")
	public String message(@PathVariable("name") String name)
	{
		return "Hello bro "+name;
	}

}
