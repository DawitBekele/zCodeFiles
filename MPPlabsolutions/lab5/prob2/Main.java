package Homework.lab5.prob2;
import java.util.ArrayList;
import java.util.List;
public class Main {
public static void main(String []args) {
	List<Figure> figureList= new ArrayList<>();
	double totalArea=0.0;
	//create the objects
	Figure f1= new Circle(2.2);
	Figure f2= new Triangle(4.0,2.2);
	Figure f3= new Rectangle(3.4,2.2);
	//add to the list
	figureList.add(f1);
	figureList.add(f2);
	figureList.add(f3);
	for(Figure f:figureList)
		totalArea+=f.computeArea();
	System.out.printf("total computed area of all figure:%.2f",totalArea);
}
}