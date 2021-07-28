package com.loveapp.lc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.loveapp.lc.daoimpl.TestConnectionClass;

@Controller
public class TestController {

	@Autowired()
	private TestConnectionClass testConnectionClass;
	
	
	@RequestMapping("/hello")
	public String test() {

		testConnectionClass.testConnection();
		
		return "Hello";
	}
}
