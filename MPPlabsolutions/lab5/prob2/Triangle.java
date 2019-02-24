package Homework.lab5.prob2;

public final class Triangle implements Figure {
private final double height;
private final double base;
public Triangle(double height, double base){
	this.height=height;
	this.base= base;
}
public double getHeight() {
	return height;
}
public double getBase() {
	return base;
}
public double computeArea() {
	return  base*height/2;
}

}
