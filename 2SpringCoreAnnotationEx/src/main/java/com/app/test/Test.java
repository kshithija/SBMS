package com.app.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.model.HandlerInfo;

public class Test {

	public static void main(String[] args) {
		//1. first create empty container
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		
		//2. find all classes from given basePackage
		ac.scan("com.app");
		
		//3. refresh spring container
		ac.refresh();
		
		//4. read object
		HandlerInfo ob = ac.getBean("hob", HandlerInfo.class); 
		
		//5. print object
		System.out.println(ob);
		

	}

}
