package com.qingli.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qingli.bean.User;
import com.qingli.service.UserService;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-config.xml");
		UserService userService = (UserService) ioc.getBean("userServiceImpl");
//		User user = (User) ioc.getBean("user");
		
//		System.out.println(user);
		System.out.println(userService);
//		User query = userService.query();
//		System.out.println(query);
		
	}
}
