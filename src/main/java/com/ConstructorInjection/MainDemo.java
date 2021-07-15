package com.ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDemo {
	public static void main(String[] args) {
		//ApplicationContext ctx=new ClassPathXmlApplicationContext("com/ConstructorInjection/consconfig.xml");
	
	ApplicationContext ctx=new ClassPathXmlApplicationContext("com/ConstructorInjection/consconfig.xml");
		Employee e = (Employee)ctx.getBean("employee");
		System.out.println(e);
	}

}
