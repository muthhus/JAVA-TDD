package com.microservice.pattern.rest.sample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class TeamDashboardController {
	
	@RequestMapping("/dashboard")
	public String welcomePage(){
		return "Hello, fans!";
	}

}
