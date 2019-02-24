package Homework.lab3.prob1;


public class Person {

	private String name;
	double salary;
	PersonWithJob personWithJob;
	Person(String n) {
		name = n;
	}
	Person(string n, PersonWithJob p){
		personWithJob= new PersonWithJob(salary);
	}
	public String getName() {
		return name;
	}
	@Override
	public boolean equals(Object aPerson) {
		if(aPerson == null) return false; 
		if(!(aPerson instanceof Person)) return false;
		Person p = (Person)aPerson;
		boolean isEqual = this.name.equals(p.name);
		return isEqual;
	}
	public static void main(String[] args) {
		
	}

}
