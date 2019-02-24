package Homework.lab5.prob4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
	private LocalDate orderDate;
	private List<Item> items;
	
	//package level access
	Order(LocalDate orderDate){
		this.orderDate=orderDate;
		items= new ArrayList();
	}	
	
	public void addItem(String name){
		items.add(new Item(name));
	}
	@Override
	public String toString() {
		return orderDate + ": " + 
	              items.toString()+"\n";
	}
}
