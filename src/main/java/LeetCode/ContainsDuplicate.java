package LeetCode;

import java.util.Arrays;
//Q.  https://leetcode.com/problems/contains-duplicate/submissions/
public class ContainsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,2,3,3,4,3,2,4,2};
		System.out.println(containsDuplicate(nums));


	}
	public static boolean containsDuplicate(int[] nums) 
	{
		boolean temp = false;
		int num=0;
		Arrays.sort(nums);
		for (int i = 0; i < nums.length-1; i++) {
			if((nums[i+1]-nums[i])==0)
			{
				temp=true;
				num=nums[i+1];
				break;
			}
			
		}
		System.out.println(num);
		return temp;
	}
}
