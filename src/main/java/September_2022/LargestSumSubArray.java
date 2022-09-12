package September_2022;

public class LargestSumSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[]= {1,-2,3,4,-4,6,-4,3,2};
		int arr[]= {-1,-2,-3};
		
		System.out.println(maxSubArraySum(arr));
	}
	public static int maxSubArraySum(int[] a)
	{
		int maxSoFar=0, maxEndingHere=0;
		for (int i = 0; i < a.length; i++) {
			maxEndingHere = maxEndingHere +a[i];
			if(maxEndingHere<0)
			{
				maxEndingHere=0;
			}
			if(maxSoFar<maxEndingHere)
			{
				maxSoFar=maxEndingHere;
			}
		}
		return maxSoFar;
	}

}
