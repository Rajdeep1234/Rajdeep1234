package leetcode.twosum;

import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] nums= {2,7,11,15};
int target=9;

Solution sl=new Solution();
int[] arr=sl.twoSum(nums, target);
System.out.println(arr[0]+":"+arr[1]);
	}

}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
       Map<Integer, Integer> mp= new HashMap<Integer, Integer>();
        int[] arr=new int[2];
        for(int i=0;i<nums.length; i++)
        {
            int val=target-nums[i];
            if(mp.get(val)!=null)
            {
                arr[0]=i;
                arr[1]=mp.get(val);
                return arr;
            }
            else
            {
                mp.put(nums[i],i);
            }
        }
        return arr;
    
    }
}