package Homework.lab9;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question2 {
public static void main(String [] args) {
	//
	IntSummaryStatistics summary= Stream.of(10,20,45,39,69)
			.collect(Collectors.summarizingInt(x->x));
	
	System.out.println(summary.getAverage());
	System.out.println(summary.getMin());
	System.out.println(summary.getMax());
}
}