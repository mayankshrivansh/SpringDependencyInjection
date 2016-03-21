package org.springtutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args)
	{
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("org\\springtutorial\\SpringConfig.xml");
		Restaurant obj = (Restaurant) context.getBean("restaurantbean");
		obj.prepareHotDrink();
	}
}
