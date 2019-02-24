package Homework.lab7.prob3.labsolns.prob2;

public interface FlyBehavior {
	public default void fly() {
		System.out.println("  fly with wings");
	}
}
