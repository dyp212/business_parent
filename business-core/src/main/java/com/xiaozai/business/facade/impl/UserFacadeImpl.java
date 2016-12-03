package com.xiaozai.business.facade.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiaozai.business.core.service.UserService;
import com.xiaozai.business.domain.User;
import com.xiaozai.business.facade.IUserFacade;

@Service("userFacade")
public class UserFacadeImpl implements IUserFacade{

	@Autowired
	private UserService userService;
	
	public String hello(String name) {
		return "hello " + name;
	}

	public User userInfo(String loginName) {
		User userInfo = userService.userInfo(loginName);
		return userInfo;
	}

}
