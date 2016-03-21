package org.lifecycle1;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Restaurant {

public void greeting(){
		
		System.out.println("Welcome friend, this is lifecycle demo with annotations !!!");
	}
	
    @PostConstruct
	public void init(){
		
		System.out.println("Initialization of bean with annotations !!");
	}
	
    @PreDestroy
    public void destroy(){
		
		System.out.println("Distruction of bean with annotations !!");
}
}
