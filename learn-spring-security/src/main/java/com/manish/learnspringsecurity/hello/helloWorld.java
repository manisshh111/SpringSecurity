package com.manish.learnspringsecurity.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorld {
	
	@GetMapping(path="/hello")
	public String HelloWorld() {
		return "Hello World";
	}

}
