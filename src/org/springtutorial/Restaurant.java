package org.springtutorial;

public class Restaurant {
	
	/*String greeting;
	
	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public void greeting(){
System.out.println(greeting); 
}*/
	
// Constructor way
	
	/*HotDrink drink;
	Restaurant(HotDrink drink){
		this.drink=drink;
	}
	
	public void prepareHotDrink(){
		
		drink.prepareHotDrink();
	}*/
	
// Setter method way
	
	HotDrink drink;
	public void setDrink(HotDrink drink){
		this.drink=drink;
	}
	
	public void prepareHotDrink(){
		
		drink.prepareHotDrink();
	}

}
