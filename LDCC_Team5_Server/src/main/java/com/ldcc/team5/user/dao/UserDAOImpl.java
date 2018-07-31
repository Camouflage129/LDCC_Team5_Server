package com.ldcc.team5.user.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ldcc.team5.model.UserModel;

@Repository("UserDAO")
public class UserDAOImpl implements UserDAO{
	@Autowired
	SqlSessionTemplate mybatis;

	@Override
	public UserModel login(UserModel model) {
		return mybatis.selectOne("UserMapper.login", model);
	}
}
