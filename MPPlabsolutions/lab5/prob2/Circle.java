package Homework.lab5.prob2;

public final class Circle implements Figure {
 private final double radius;
 public Circle(double radius){
	 this.radius= radius;
 }
 public double gerRadius(){
	 return radius;
 }
 public double computeArea(){
	 return Math.PI*radius*radius;
 }
}
