package Homework.lab5.prob4;

import java.time.LocalDate;

public class CustomerOrderFactory{
	//private constructor
	
	private CustomerOrderFactory(){
		
	}
	
// factory method to create a customer object
	public static Customer newCustomer(String name){		
		Customer cust = new Customer(name);		
		return cust;
	}
	//factory method to create a new order
	public static Order newOrder(Customer cust, LocalDate date){
		if(cust == null) throw new NullPointerException("Null customer");
		Order ord = new Order(date);
		cust.addOrder(ord);
		return ord;
	}
}
