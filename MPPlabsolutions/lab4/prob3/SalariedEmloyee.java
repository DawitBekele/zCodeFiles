package Homework.lab4.prob3;

import java.time.Month;

public class SalariedEmloyee extends Employee {
	double salary;
	public SalariedEmloyee(double salary,String empId) {
		super(empId);
		this.salary=salary;
	}
	public double	calcGrossPay(Month month,int year){
		print(month,year);
		return salary;	
		}
}
