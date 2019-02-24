package Homework.lab5.prob3;

public class VehicleFactory {
 private VehicleFactory() {
	 
 }
 public static Vehicle getVehicle(String name) {
	 
	 Vehicle v=null;
	  if(name.equalsIgnoreCase("car")) {
		 v= new Car(); 
	  }
	  else if(name.equalsIgnoreCase("bus")) {
		  v= new Bus();
	  }
	  else if(name.equalsIgnoreCase("Truck")) {
		  v= new Truck();
	  } 
	  else if(name.equalsIgnoreCase("electric")) {
		  v= new ElectricCar();
	  }
	  else 
		  System.out.println("wrong input");
	 return v;
 } 
}
