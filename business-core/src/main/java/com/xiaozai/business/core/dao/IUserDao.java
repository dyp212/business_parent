package com.xiaozai.business.core.dao;

import org.apache.ibatis.annotations.Param;

import com.xiaozai.business.domain.User;

public interface IUserDao {

	User findUserByLoginName(@Param(value="loginName")String loginName);
}
