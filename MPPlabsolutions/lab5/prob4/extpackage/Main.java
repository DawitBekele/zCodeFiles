package Homework.lab5.prob4.extpackage;

import java.time.LocalDate;

import Homework.lab5.prob4.Customer;
import Homework.lab5.prob4.CustomerOrderFactory;
import Homework.lab5.prob4.Order;

public class Main {
	public static void main(String[] args) {
		Customer cust = CustomerOrderFactory.newCustomer("Bob");
		Order order = CustomerOrderFactory.newOrder(cust, LocalDate.now());
		order.addItem("Shirt");
		order.addItem("Laptop");		
		order = CustomerOrderFactory.newOrder(cust, LocalDate.now());
		order.addItem("Pants");
		order.addItem("Knife set");
		System.out.println(cust.getOrders());
	}
}

		
