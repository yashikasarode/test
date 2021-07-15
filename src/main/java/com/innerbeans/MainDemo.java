package com.innerbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx= new ClassPathXmlApplicationContext("com/innerbeans/innerconfig.xml");
		Employee bean =(Employee) ctx.getBean("employee");
		System.out.println(bean.hashCode());
		Employee bean2 =(Employee) ctx.getBean("employee");
		System.out.println(bean2.hashCode());

	}

}
