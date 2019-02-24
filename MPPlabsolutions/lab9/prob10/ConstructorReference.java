package Homework.lab9.prob10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

class Human
{
	String name;
	int age;
	String gender;
	
	public Human(String name){
		this.name = name;
	}
	public Human(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public Human(String name,int age, String gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}

public class ConstructorReference {
public static void main(String args[]){
	Human[] list = { new Human("Joe",35,"Male"), new Human("Jane",45,"Female"), new Human("John",30,"Male")};
	
    // Query 1  : Print only Female canditates names
	Arrays.stream(list).filter(e->e.getGender()=="Female").forEach(System.out::println);
	
    // Query 2 : Cretae an object by choosing suitable Interface to the specified constructors(Totally 3 constuctors)using fouth type of Method Reference ClassName::new. Then print the object status 
	//invoke a constructor with one argument 
	Function<String,Human> f1= Human::new;
	    System.out.println(f1.apply("kebede"));
	  //invoke a constructor with two argument
	    BiFunction<String, Integer, Human> f2= Human::new;
	    System.out.println(f2.apply("Bekele",60));
	    //invoke a constructor with two argument
	    TriFunction<String, Integer, String, Human> f3= Human::new;
	    System.out.println(f3.apply("Markos",26, "Male"));
	    
	// Query 3 : Count the male candidates whose age is more than 30
   int maleCount= (int) Arrays.stream(list).filter(e->e.getGender()
		   .compareToIgnoreCase("male")==0 && e.getAge()>30).count();    
     System.out.println(maleCount);
   }



}
