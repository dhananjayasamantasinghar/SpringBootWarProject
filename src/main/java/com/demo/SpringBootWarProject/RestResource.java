package com.demo.SpringBootWarProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class RestResource {

	@GetMapping("/msg")
	public String getMessage(){
		return "Welcome HDhananjaya!!";
	}
}
