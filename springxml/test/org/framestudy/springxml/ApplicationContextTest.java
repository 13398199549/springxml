package org.framestudy.springxml;

import org.framestudy.springxml.bean.UserBean;
import org.framestudy.springxml.config.Configuration;
import org.framestudy.springxml.usermag.service.IUserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextTest {

	private ApplicationContext context;
	
	private IUserService userServiceImpl;
	private Configuration config;
	
	@Before
	public void before() {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
	@Test
	public void getConfiguration() {
		
		config = (Configuration) context.getBean("configuration");
		System.out.println(config);
		
	}
	
	
	@Test
	public void saveUserBean() {
		userServiceImpl = (IUserService) context.getBean("userServiceImpl");
		UserBean user = new UserBean();
		user.setId(1L);
		user.setUserName("张三");
		user.setPassword("123456");
		userServiceImpl.saveUserBean(user);
	}
	
}
