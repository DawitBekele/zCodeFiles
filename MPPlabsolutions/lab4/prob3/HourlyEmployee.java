package Homework.lab4.prob3;

import java.time.Month;

public class HourlyEmployee extends Employee{
	double hourlyWage;
	double hoursPerWeek;
	public HourlyEmployee(double hourlyWage,double hoursPerWeek,String empId) {
		super(empId);
		this.hourlyWage=hourlyWage;
		this.hoursPerWeek=hoursPerWeek;
	}
 public double	calcGrossPay(Month month,int year){
	   print(month,year);	  
	  return  hourlyWage*hoursPerWeek*4;	
	}
}
