package Homework.lab7.prob3.labsolns.prob2;

public class DecoyDuck extends Duck implements FlyBehavior,QuackBehavior{
	public DecoyDuck() {		
	}
	@Override
	public void fly() {
		System.out.println("  cannot fly");
	}
	@Override
	public void quack() {
		System.out.println("  cannot quack");
	}
	@Override
	public void display() {
		System.out.println("  displaying");
		
	}
}
