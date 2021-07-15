package com.Assignment2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDemo {
	public static void main(String[] args) {
		AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("com/Assignment2/assconfig.xml");
		Ticket_Reservation bean = (Ticket_Reservation)ctx.getBean("ticket");
		System.out.println(bean);
		ctx.registerShutdownHook();
		
		
	}

}
