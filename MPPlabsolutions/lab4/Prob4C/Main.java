package Homework.lab4.Prob4C;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Commissioned commissioned = new Commissioned(10,1000,"E21");
		commissioned.addOrder(1, LocalDate.of(2018, 12, 17), 400);
		commissioned.addOrder(1, LocalDate.of(2018, 11, 13), 500);
		//Calculate Paycheck
		commissioned.print();
		
		Employee salaried = new Salaried(4500, "E22");
		salaried.print();
		
		Employee hourly = new Hourly(120, 30, "E23");
		hourly.print();
	}

}
