package com.ldcc.team5.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@RequestMapping(value="/main.do")
	public String mainDo() {
		return "index.jsp";
	}
}
