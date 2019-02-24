package Homework.lab9;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question1 {
public static void main(String [] args) {
	String streamString=Stream.of("Bill","Thomas","Mary").collect(Collectors.joining(","));
	System.out.println(streamString);
	
}
}
