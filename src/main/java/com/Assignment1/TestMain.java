package com.Assignment1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx= new ClassPathXmlApplicationContext("com/Assignment1/scitconfig.xml");
		ShoppingCart s = (ShoppingCart)ctx.getBean("shoppingcart");
		System.out.println(s);

	}

}
