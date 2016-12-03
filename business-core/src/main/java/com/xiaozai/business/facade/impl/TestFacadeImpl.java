package com.xiaozai.business.facade.impl;

import org.springframework.stereotype.Service;

import com.xiaozai.business.facade.ITestFacade;

@Service("testFacade")
public class TestFacadeImpl implements ITestFacade{

	public String test() {
		return "test request success!";
	}

}
