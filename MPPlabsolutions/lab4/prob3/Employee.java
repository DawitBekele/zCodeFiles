package Homework.lab4.prob3;

import java.time.Month;

public abstract class Employee {
protected String empId;
PayCheck payCheck;
Employee(String empId){
	this.empId=empId;
}
abstract double calcGrossPay(Month month,int year);
public PayCheck calCompensation(Month month,int year) {
	double grossPay=calcGrossPay(month,year);	
	double fica=0.23*grossPay;
	double stateTax=0.05*grossPay;
	double localTax=0.01*grossPay;
	double medicare=0.03*grossPay;
	double socialSecurity=0.075*grossPay;
	payCheck= new PayCheck(grossPay,fica,stateTax,localTax,medicare,socialSecurity);
	return payCheck;
}
public void print(Month month,int year) {
	System.out.println("the salary of"+ empId+ ":");
}
}
