package org.springcollectiondemo;

import java.util.List;

public class Restaurant {
	
	List waiter;

	public List getWaiter() {
		return waiter;
	}

	public void setWaiter(List waiter) {
		this.waiter = waiter;
	}
	
	public void displayWaiters(){
		
		System.out.println("All the waiters working in a Restaurant are: " + waiter);
	}
	

}
