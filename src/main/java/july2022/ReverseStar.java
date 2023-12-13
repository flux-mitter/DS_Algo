package july2022;

import java.util.Iterator;

public class ReverseStar {
	
	public static void main(String[] args) {
		
//		
//		* * * * *
//		 * * * *
//		  * * *
//		   * *
//		    *
			
		int x=5;
		for(int i=x;i>0;i--)
		{
			for(int j=0;j<x-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
				System.out.print(" ");
			}
			for(int j=0;j<x-i;j++)
			{
				System.out.print(" ");
			}
			System.out.println();
		}
	
	}

}
