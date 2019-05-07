package br.com.postalisonline.api.controller;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@RequestMapping("/api/hello")
	public String helloWorld() {
 
		return "Hello World !!!!" ;
	}
	
	@RequestMapping("/api/message")
	@Produces(MediaType.APPLICATION_JSON)
	public Message message() {
 
		return new Message("Hello World !!!!") ;
	}

}
