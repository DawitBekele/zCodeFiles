package Homework.lab4.prob3;

import java.time.LocalDate;

public class Order {
String orderNumber;
double orderAmount;
CommissionedEmployee commEmployee;
LocalDate orderDate;
  Order(String orderNumber,double orderAmount,LocalDate orderDate){
	 this.orderNumber=orderNumber;
	 this.orderAmount=orderAmount;
	 this.orderDate=orderDate;
 }
public void setOrderNumber(String orderNumber) {
	this.orderNumber = orderNumber;
}
public void setOrderAmount(double orderAmount) {
	this.orderAmount = orderAmount;
}
public void setOrderDate(LocalDate orderDate) {
	this.orderDate = orderDate;
}
public String getOrderNumber() {
	return orderNumber;
}
public double getOrderAmount() {
	return orderAmount;
}
public LocalDate getOrderDate() {
	return orderDate;
}

}
