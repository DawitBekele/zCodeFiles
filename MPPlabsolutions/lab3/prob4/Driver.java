package Homework.lab3.prob4;

public class Driver {

	public static void main(String[] args) {
		Property [] objects = { new House(9000), new Condo(2), new Trailer() };
		double totalRent = Admin.computeTotalRent(objects);
		
		Property.computearea();
		System.out.println("The total rent is:"+totalRent);

	}

}
