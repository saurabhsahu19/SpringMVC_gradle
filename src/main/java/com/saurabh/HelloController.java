package com.saurabh;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {
	
	@RequestMapping("/greetings")
	public String hello(){
		return "Greetings Mr. ";
	}

}
