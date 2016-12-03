package com.xiaozai.business.facade;

import com.xiaozai.business.domain.User;

public interface IUserFacade {

	String hello(String name);
	
	User userInfo(String loginName);
}
