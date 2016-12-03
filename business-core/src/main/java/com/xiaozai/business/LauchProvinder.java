package com.xiaozai.business;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LauchProvinder {

	public static void main(String[] args) {
		try {
			ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:config/spring-all.xml");
			System.out.println("dubbo provider is running..."); 
			System.in.read();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
