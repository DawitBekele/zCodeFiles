package section1;

public class LongestSubstring {
	private static String  str;
	
	public static void main(String [] args) {
		String s="asbjacba";
		System.out.println(lengthOfLongestSubstring(s)) ;
		System.out.println(str);
	}
	 public static int lengthOfLongestSubstring(String s) {
	        //String str1="";
	        String maxStr="";
	        if(s==null)
	            return 0;
	        if(s.length()==0)
	            return 1;
	       
	        for(int i=0; i<s.length();i++){
	        	String str1="";
	        	for(int j=i;j<s.length();j++) {
	            if(!str1.contains(""+s.charAt(j))){
	                str1+=s.charAt(j);
	            }
	            else {
	            	maxStr=maxStr.length()>str1.length()?maxStr:str1;
	            	str1=""+s.charAt(j);	            	
	            }
	            
	        }
	        	//str1="";
	        	maxStr=maxStr.length()>str1.length()?maxStr:str1;
	        }
	        	// maxStr=maxStr.length()>str1.length()?maxStr:str1;
	        str=maxStr;
	        return maxStr.length();
	    }
}
