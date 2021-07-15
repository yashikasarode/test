package com.lifecycle.interfac;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDemo {
	public static void main(String[] args) {
		AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("com/lifecycle/annotations/lcconfig.xml");
		Patient bean = (Patient)ctx.getBean("patient");
		System.out.println(bean);
		ctx.registerShutdownHook();
		
	}

}