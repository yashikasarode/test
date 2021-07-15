package com.Assignment3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDemo {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/Assignment3/univconfig.xml");
		University university = (University)ctx.getBean("university");
		System.out.println(university);
		
		
	}

}
