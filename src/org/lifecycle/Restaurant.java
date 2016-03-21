package org.lifecycle;

public class Restaurant {

	public void greeting(){
		
		System.out.println("Welcome friend, this is lifecycle demo !!!");
	}
	
	public void init(){
		
		System.out.println("Initialization of bean !!");
	}
	
    public void destroy(){
		
		System.out.println("Distruction of bean !!");
	}
}
