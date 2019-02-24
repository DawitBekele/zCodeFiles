package Homework.lab9;

import java.util.List;
import java.util.Set;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class prob6 {

	public static void main(String[] args) {		
		Set<String> s1= new TreeSet();
		s1.add("A");
		s1.add("B");
		Set<String> s2= new TreeSet();
		s2.add("C");
		s2.add("d");		
		List<Set<String>> lSets= new ArrayList();
	lSets.add(s1);
	lSets.add(s2);
	System.out.println(union(lSets));
	
	
	}
	public static Set<String>  union(List<Set<String>> lSets){
		return lSets.stream().flatMap(l->l.stream()).collect(Collectors.toSet());
				
	}
}
