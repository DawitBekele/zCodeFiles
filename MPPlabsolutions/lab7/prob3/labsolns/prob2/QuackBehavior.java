package Homework.lab7.prob3.labsolns.prob2;

public interface QuackBehavior {
	public  default void quack(){
		System.out.println("  quacking");
	}
}
