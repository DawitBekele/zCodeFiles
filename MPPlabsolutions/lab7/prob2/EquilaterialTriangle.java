package Homework.lab7.prob2;

public class EquilaterialTriangle implements Polygon {
	private double side;
	EquilaterialTriangle(double side){
		this.side=side;
	}
	@Override
	public double[] getSides(){
		double [] sides= {this.side,this.side,this.side};
		return sides;
	}
}
