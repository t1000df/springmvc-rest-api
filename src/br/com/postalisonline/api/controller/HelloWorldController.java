package br.com.postalisonline.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@RequestMapping("/api/hello")
	public String helloWorld() {
 
		return "Hello World !!!!" ;
	}
	
	@RequestMapping("/api/message")
	public Message message() {
 
		return new Message("Hello World !!!!") ;
	}

}
