package com.ldcc.team5.user.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("UserDAO")
public class UserDAOImpl implements UserDAO{
	@Autowired
	SqlSessionTemplate mybatis;
}
