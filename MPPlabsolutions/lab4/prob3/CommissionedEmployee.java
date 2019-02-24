package Homework.lab4.prob3;

import java.time.Month;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class CommissionedEmployee extends Employee {
private double salary;
 double commission=0.20;
List<Order> orders= new ArrayList();
CommissionedEmployee(double commission, double salary, String empId){
	super(empId);	
	this.commission=commission;
	this.salary=salary;
}

	public double calcGrossPay(Month month,int year){
		double totalOrderAmount=0.0;
		
		print(month,year);
		for(Order or:orders) { 			
			if(or.orderDate.getMonth()==month && or.orderDate.getYear()==year) {
			totalOrderAmount+=or.getOrderAmount();
			 }
		  }
		return salary+commission*totalOrderAmount;	
		}
	public void addOrder(Order order) {
		 orders.add(order);
	}
	
}
