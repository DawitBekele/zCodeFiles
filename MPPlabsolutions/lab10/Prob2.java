package Homework.lab10.prob1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Prob2 {


	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(2,4,5,7,9);
		//second Smallest from the list
       System.out.println(secondSmallest(list));
	}
	
	public static <T extends Comparable<? super T>> T secondSmallest(List<T> list) {

		Optional<T>secondSmallest = list.stream().sorted().skip(1).findFirst();		
		return secondSmallest.get();
	}

}
