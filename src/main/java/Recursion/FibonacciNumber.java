package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		/*
		 * Over lapping sub problems
		 * Memoization : tend to store value of sub problems in map or table
		 * 

		 */
		Scanner keyboard = new Scanner(System.in);
		System.out.println("enter an integer");
		int n = keyboard.nextInt();
		int[] dp = new int[n];
		Arrays.fill(dp, -1);
		//System.out.println(dp[1]);
		System.out.println(f(n, dp));
		
	}

	public static int f(int n, int[] dp)
	{
		if(n<=1)
		{
			return n;
		}
		else if(dp[n] != -1)
		{
			return dp[n];
		}
		else return dp[n] = f(n-1,dp) + f(n-2,dp);
		
		
	


	}

}
