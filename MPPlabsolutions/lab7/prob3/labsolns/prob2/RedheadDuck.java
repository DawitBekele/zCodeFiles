package Homework.lab7.prob3.labsolns.prob2;

public class RedheadDuck extends Duck  implements FlyBehavior,QuackBehavior{
	public RedheadDuck() {		
	}
	public void fly() {
		System.out.println(" fly with wings");
	}
	
	public void quack() {
		System.out.println("  quacking");
	}
	@Override
	public void display() {
		System.out.println("  displaying");
		
	}
}
