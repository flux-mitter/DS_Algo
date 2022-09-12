package September_2022;

import java.util.Arrays;

public class ArrangeNumbers {

	//Page 31 Hemant Jain
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {8,-1,6,1,9,3,2,7,4,-1};
		index(arr);
		// expected output = -1,1,2,3,4,-1,6,7,8,9
	}
		public static void index(int arr[])
		{
			Arrays.sort(arr);
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+",");
			}
		}
}
