package com.ref_type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/ref_type/refconfig.xml");
		Student s= (Student)ctx.getBean("student");
		System.out.println(s);

	}

}
