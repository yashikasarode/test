package com.DependencyCheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDemo {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/DependencyCheck/checkconfig.xml");
		Prescription bean =(Prescription) ctx.getBean("prescription");
		System.out.println(bean);
		
	}

}
