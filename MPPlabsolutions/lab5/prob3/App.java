package Homework.lab5.prob3;

public class App {
 public static void main(String [] args) {
	 String name="electric";
	Vehicle v= VehicleFactory.getVehicle(name);
	if(v!=null)
	 v.startEngine();
} 
}