package Homework.lab9;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class prob4 {
	public static void printSquares(int num) {
		 IntStream intS=IntStream.iterate(1, n->n+1).map(i->i*i).limit(num);
		  intS.forEach(System.out::println);
	
	}
	
	public static void main(String[] args) {
		//num=4
		printSquares(4);
	}
 
}
