package july2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SmallPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//remove second highest number
		Integer[] num = {1,3,9,5,2};
		//Integer[] numbers = new Integer[] {1,3,9,5,2};
		List<Integer> arr = Arrays.asList(num);
		//System.out.println(arr.lastIndexOf(9));
		
		//Set<Integer> set = new TreeSet<Integer>(arr);
		//ArrayList<String> arr1 = new ArrayList<>();
	//	Set<String> ts = new TreeSet<>();
		Set<Integer> ts1 = new TreeSet<>();
		ts1.addAll(arr);
		//ts1.remove(ts1)
		//System.out.println(ts1.);
		Integer[] aar= new Integer[ts1.size()];
		int i1=0;
		for(Integer i:ts1)
		{
			if(i1==1)
			{
				i1++;
				continue;
				
			}
			else
			{
			aar[i1++]=i;
			}
			
		}
	
		for(int x= 0;x<aar.length;x++)
		{
			System.out.println(aar[x]);
		}
		
	}

}
