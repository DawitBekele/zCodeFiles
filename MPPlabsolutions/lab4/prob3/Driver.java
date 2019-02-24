package Homework.lab4.prob3;
import java.util.Collections;
import java.time.LocalDate;
import java.time.Month;

public class Driver {

	public static void main(String[] args) {
		Employee hr1= new HourlyEmployee(30.0,60,"hr1");
		//Employee hr2= new HourlyEmployee(25.0,5,"hr2");
		hr1.calCompensation(Month.DECEMBER, 2018);
		LocalDate d = LocalDate(2018,10,10);
		
		
		Employee com1 = new CommissionedEmployee(0.25,1000,"com1");
		PayCheck pc = com1.calCompensation(Month.DECEMBER, 2018);
		Order or = new Order("12",10,LocalDate.of(2018, Month.DECEMBER,10));
		//com1.addOrder(or);
		
		
		Employee sal1= new SalariedEmloyee(4000,"com1");
		 sal1.calCompensation(Month.DECEMBER, 2018);
		

	}

}
