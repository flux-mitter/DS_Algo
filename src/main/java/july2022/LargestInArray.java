package july2022;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class LargestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,4,2,8,5,11};
		
		List<int[]> list= Arrays.asList(arr);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list.get(0));
		
//		int max=arr[0];
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]>max)
//			{
//				max=arr[i];
//			}
//		}
//		System.out.println(max);
	}

}
