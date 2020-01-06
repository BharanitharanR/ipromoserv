package com.intelli.promotion.centralServer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restPrimServce 
{

	@GetMapping("/hello/{name}")
	String hello(@PathVariable String name)
	{
		return name;
	}
	
}
