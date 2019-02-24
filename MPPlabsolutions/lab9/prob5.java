package Homework.lab9;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class prob5 {
	
		public static Stream<String> streamSection(Stream<String> stream, int m, int n) {
		Stream<String> strStream= stream.skip(m).limit(n-m+1);
		return strStream;
		}
		public static void main(String[] args) {
			
			String str1= streamSection(nextStream(),2,3).collect(Collectors.joining(","));
		System.out.println(str1);		
		
		String str2=	streamSection(nextStream(),3,7).collect(Collectors.joining(","));
		System.out.println(str2);
		
		String str3=	streamSection(nextStream(),7,8).collect(Collectors.joining(","));
		System.out.println(str3);	
		}
		//support method for the main method -- for testing
		private static Stream<String> nextStream() {
		return Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg", "hhh", "iii").stream();
		}
		}


