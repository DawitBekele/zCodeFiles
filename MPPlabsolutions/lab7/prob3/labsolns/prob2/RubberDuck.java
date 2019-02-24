package Homework.lab7.prob3.labsolns.prob2;

public class RubberDuck extends Duck implements FlyBehavior,QuackBehavior {
	public RubberDuck() {
		
	}
	@Override
	public void fly() {
		System.out.println("  cannot fly");
	}
	@Override
	public void quack() {
		System.out.println("  squeaking");
	}
	@Override
	public void display() {
		System.out.println("  displaying");
		
	}
}
