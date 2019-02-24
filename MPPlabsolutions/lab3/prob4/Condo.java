package Homework.lab3.prob4;

public class Condo extends Property{
int numberOfFloor;
//Address address;
Condo(int numberOfFloor){
	this.numberOfFloor=numberOfFloor;
}
public int getNumberOfFloor() {
	return numberOfFloor;
}
public void setNumberOfFloor(int numberOfFloor) {
	this.numberOfFloor = numberOfFloor;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public double computeRent() {
	return 400*numberOfFloor;
}
}
