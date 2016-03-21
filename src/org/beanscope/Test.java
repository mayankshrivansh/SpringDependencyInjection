package org.beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.beanscope.Restaurant;

public class Test {
	
	public static void main(String[] args)
	{
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("org\\beanscope\\config.xml");
		Restaurant obj = (Restaurant) context.getBean("restaurantbean");
		obj.setGreeting("Welcome to the dhaba !!!!");
		obj.greeting();
		
		Restaurant obj1 = (Restaurant) context.getBean("restaurantbean");
		//obj1.setGreeting("Welcome to the dhaba oye oye....... !!!!");
		obj1.greeting();
	}

}
