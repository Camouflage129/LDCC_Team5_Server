package com.ldcc.team5.user.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ldcc.team5.user.dao.UserDAO;

@Service("UserService")
public class UserServiceImpl implements UserService{
	
	@Resource(name="UserDAO")
	UserDAO dao;
}
