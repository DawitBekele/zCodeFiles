package Homework.lab9;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
 //user defined interface 
interface Myinterface2<T,U,V,R>{
	public  int apply(T t,U u,V v);
}

public class Question3 {
	 
	 
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		List<String> words= Arrays.asList("check", "comic", "dairy", "desk", "write", "some", "Java");
		char ch1='c';
		char ch2='d';
		int len=5;
		//output for good way
		System.out.println(countWords(words,ch1,ch2,len));//outputs 2	
		//int x= words.Stream().filter(Myinterface1.test())

	}
	// good way of counting words from a list with the given criteria
	public static int countWords(List<String> words, char c, char d, int len) {
		int count= (int)words.stream()
				.filter(word->word.contains(""+c)&&!(word.contains(""+d))&&word.length()==len).count();
				return count;
	}
	
	//better way of counting words from a list with the given criteria
	 final Myinterface2<List<String>,String,String,Integer> myinterface2= (list,c,d,len)->list.stream()
				.filter(name->name.contains(""+c)&&!(name.contains(""+d))&&name.length()==len)
				.count();

}
