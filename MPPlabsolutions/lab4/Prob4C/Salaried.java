package Homework.lab4.Prob4C;

public class Salaried extends Employee{

	private double salary;

	public Salaried (double salary, String empId){
		super(empId);
		this.salary = salary;
	}
	
	@Override
	double calcGrossPay(int month, int year) {
		return salary;
	};
	
	public double getSalary() {
		return salary;
	}
}
