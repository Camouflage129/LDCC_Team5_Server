package com.ldcc.team5.web.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ldcc.team5.model.UserModel;
import com.ldcc.team5.user.service.UserService;

@RestController
public class UserController {
	@Resource(name="UserService")
	UserService service;
	
	@RequestMapping(value="/main.do")
	public String mainDo() {
		return "index.jsp";
	}
	
	@CrossOrigin
	@RequestMapping(value="/login/{id}/{pw}", method = RequestMethod.GET)
	public ResponseEntity<List<UserModel>> login(@PathVariable("id") String id, @PathVariable("pw") String pw) {
		ResponseEntity<List<UserModel>> resEntity = null;
		List<UserModel> list = new ArrayList<>();
		try {
			UserModel login = service.login(new UserModel(id, pw));
			if(login != null) {
				login.setPw("");
				list.add(login);
				System.out.println(login);
				resEntity = new ResponseEntity<>(list, HttpStatus.OK);
			}
			else 
				resEntity = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		} catch (Exception e) {
			e.printStackTrace();
			resEntity = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return resEntity;
	}
}
