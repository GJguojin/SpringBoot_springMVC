package com.ji.springMvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/rest/test")
public class TestController {
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public Message  getTest() throws InterruptedException{
		System.out.println("调用 test...");
		Thread.sleep(100);   // 
		return new Message("hello world!!");
	}

}
