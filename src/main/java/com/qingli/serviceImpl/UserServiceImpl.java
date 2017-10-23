package com.qingli.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qingli.bean.User;
import com.qingli.mapper.UserMapper;
@Service
public class UserServiceImpl implements com.qingli.service.UserService {
@Autowired
UserMapper userMapper;
	@Override
	public User query() {
		User user = userMapper.selectUser();
		return user;
	}

}
