package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.model.Repository;
import com.app.service.Service;

public class Test {

	public static void main(String[] args) {
	
		ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
		//Repository r = (Repository)ac.getBean("rob");
		Service s = (Service) ac.getBean("sob");
		System.out.println(s);
	}

}
