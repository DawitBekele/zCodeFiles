package section1;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class LongestPalindrem {

	
	public static void main(String[] args) {
		String str="bdjdkldjkl";
		System.out.println(findLongestPalindremString(str));

	}
//	public static String findLongestPalindremString(String s){
//	  String longestPalindrem ="";
//		for(int i=0;i<s.length();i++) {
//			for(int j=i+1;j<s.length();j++) {
//				if(isPalindrem(s.substring(i, j+1))) {
//					longestPalindrem= longestPalindrem.length()>s.substring(i,j+1).length()?longestPalindrem:
//						s.substring(i,j+1);
//				}
//			}
//			
//		}
//		return longestPalindrem;
//	}
	
	//storing all the possible combiantion of palindrem in a set data structure
	public static String findLongestPalindremString(String s){
		Set<String> stringSet= new HashSet();		
		  String longestPalindrem ="";
			for(int i=0;i<s.length();i++) {
				for(int j=i+1;j<s.length();j++) {
					stringSet.add(s.substring(i,j+1));
					}
				}
			for(String str:stringSet)	{
				if(isPalindrem(str))
					longestPalindrem= longestPalindrem.length()>str.length()?longestPalindrem:str;	
			}
			
			return longestPalindrem;
		}
	
	
	public static boolean isPalindrem(String s) {
		boolean b;
		if(s.length()==1)
			b=true;
		else if(s.length()==2)
			b=s.charAt(0)==s.charAt(1);
		else{
			if(s.charAt(0)==s.charAt(s.length()-1))
			b=isPalindrem(s.substring(1,s.length()-1));
			else 
				b=false;
		}
		return b;
	}

}
