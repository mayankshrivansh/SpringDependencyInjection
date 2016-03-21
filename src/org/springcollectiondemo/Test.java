package org.springcollectiondemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springcollectiondemo.Restaurant;

public class Test {

	public static void main(String[] args)
	{
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("org\\springcollectiondemo\\config.xml");
		Restaurant obj = (Restaurant) context.getBean("restaurantbean");
		obj.displayWaiters();
	}
}
