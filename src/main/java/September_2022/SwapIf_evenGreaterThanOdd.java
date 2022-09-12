package September_2022;


/** page 30**/
public class SwapIf_evenGreaterThanOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {8,1,2,3,4,5,6,4,2};
		waveArray2(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
		}

	}
	
	public static void waveArray2(int[] arr)
	{
		for(int i=0; i<arr.length; i+=2)
		{
			if((i-1)>=0 && arr[i]>arr[i-1])
			{
				swap(arr,i,i-1);
			}
			if((i+1<arr.length) && arr[i]>arr[i+1])
			{
				swap(arr,i,i+1);
			}
		}
		
	}
	public static void swap(int arr[],int i,int j)
	{
		//i even
		//j odd
		int temp = arr[i];
		arr[i]= arr[j];
		arr[j]=temp;
	}

}
