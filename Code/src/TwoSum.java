import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {

	public static void main(String[] args) {
		
		Solution sol=	new Solution();
		List<List<Integer>> list=sol.threeSum(new int[] {0,0,0,0});
		System.out.println(list);
		
	}

}


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
       Map<Integer,List<Integer>> mp=new HashMap<Integer, List<Integer>> ();
       List<List<Integer>> list2=new ArrayList<List<Integer>>();
       Map<Integer, Integer> mp1=new HashMap<Integer, Integer>();
      
       for(int i=0;i<nums.length;i++)
       {
    	  
    	   mp1.put(nums[i], i);
       }
       
       if(mp1.size()==1)
       {
    	   List<Integer> ls= new ArrayList<Integer>();
    	   ls.add(nums[0]);
    	   ls.add(nums[0]);
    	   ls.add(nums[0]);
    	   list2.add(ls);
    	   return list2;
       }
		        for(int i=0;i<nums.length-2;i++)
		        {
		        	 for(int j=i+1;j<nums.length-1;j++)
		        	 {
		        		 for(int k=j+1;k<nums.length;k++)
		        		 {
		        		   if( nums[i]+nums[j]+nums[k]==0 )
		        		   {
		        			 List<Integer> list=new ArrayList<Integer>();
		        			 list.add(nums[i]);
		        			 list.add(nums[j]);
		        			 list.add(nums[k]);
		        			 Collections.sort(list);
		        			 list2.add(list);
		        		   }
		        		 }
		        	 }
		        }
		        for(int i=0;i<list2.size();i++)
		        {
		        	 for(int j=i+1;j<list2.size();j++)
		        	 {
		        		 List<Integer> vari = list2.get(i);
		        		 List<Integer> varj = list2.get(j);
		        		 
		        		if( vari.get(0)==varj.get(0) && vari.get(1)==varj.get(1) && vari.get(2)==varj.get(2))
		        		{
		        			list2.remove(j);
		        		}
		        		 
		        	 }
		        	
		        	
		        }
				return list2;
        
    }
}