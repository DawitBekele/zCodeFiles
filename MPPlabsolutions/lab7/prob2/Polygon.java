package Homework.lab7.prob2;

public interface Polygon extends ClosedCurve {
	public default double computePerimeter(){
		double []sides=this.getSides();
		double perimeter=0.0;
		for(int i=0; i<sides.length;i++) {
			perimeter+=sides[i];
		}
		return perimeter;
	}
	public double[] getSides();
}
