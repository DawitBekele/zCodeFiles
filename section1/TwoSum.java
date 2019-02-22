package section1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum {
	public static void main(String [] args) {
		int b[]= {2,4,5,6,8};
		int [] nums = {-1, 0, 1, 2, -1, -4};
		List<Integer> l1= Arrays.asList(1,4,5,6);
		List<Integer> l2= Arrays.asList(1,4,5,6);
		List<List<Integer>> l3=new ArrayList<>();
		l3.add(l1);
		l3.add(l2);
		//System.out.println(l3);
		int num=11;
		//System.out.println(Arrays.toString(twoSum(b,num)));
		System.out.print(threeSum(nums));
	}
    public  static int[] twoSum(int[] nums, int target) {
        int flag=0;
        int index1=-1,index2=-1;
       
        if(nums.length>=2){
        for(int i=0;i<nums.length && flag==0;i++){
            for(int j=i+1;j<nums.length && flag==0;j++){
                if(nums[i]+nums[j]==target){
                    flag=1;
                    index1=i;
                    index2=j;
                }
            }
        }
        }
   int a[]={index1,index2};
        return a;
    }
    //given a list of integers, extract List of list fulfilling a+b+c=0 and no duplicate is needed
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> threeSums= new ArrayList();
        List<List<Integer>> tempthreeSums= new ArrayList();
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                    	List<Integer>tempList=new ArrayList<>();
                        tempList.addAll(Arrays.asList(nums[i],nums[j],nums[k]));
                        threeSums.add(tempList);                        
                   }               
                  
                   
                    }
                   
                }
            
            }
        for(List<Integer> l:threeSums) {
        	if(!tempthreeSums.contains(l)) {
        		tempthreeSums.add(l);
        	}
        		
        }
        return tempthreeSums;
    }
    
}
