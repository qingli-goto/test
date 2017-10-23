package com.qingli.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qingli.bean.User;
import com.qingli.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService userService;
@RequestMapping("/user")
	public User getUser() {
		User user = userService.query();
		System.out.println(user);
		System.out.println(111111111);
		return user;
	}

}
