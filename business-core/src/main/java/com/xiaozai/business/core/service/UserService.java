package com.xiaozai.business.core.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xiaozai.business.core.dao.IUserDao;
import com.xiaozai.business.domain.User;

@Service
public class UserService {
	
	@Resource
	private IUserDao userDao;
	public User userInfo(String loginName){
		return userDao.findUserByLoginName(loginName);
	}
}
