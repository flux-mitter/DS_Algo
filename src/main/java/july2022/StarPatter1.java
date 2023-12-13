package july2022;

public class StarPatter1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*
		 *
		* *
	   * * *
	  * * * * 
	 * * * * *
	 
	
	  */
		int length=5;
		int cnt = length -1;
		for(int i=1;i<=length;i++)
		{
			for(int j=cnt;j>0;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
				System.out.print(" ");
			}
			for(int j=cnt;j>0;j--)
			{
				System.out.print(" ");
			}
			System.out.println();
			cnt--;
			
		}

	}

}
