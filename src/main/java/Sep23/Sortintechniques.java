package Sep23;

import java.util.Iterator;

public class Sortintechniques {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={2, 7, 3, 6, 9};
		bubbleSort(arr);

	}
	
	public static void bubbleSort(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		System.out.println(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+", ");
		}
	}
	
	public static void insertionSort(int[] arr)
	{
		int[] output= new int[arr.length];
		for(int i=0;i<arr.length-1;i++)
		{
			//for()
		}
	}
	

}
