package September_2022;

public class RotatingArrayByKPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6};
		rotateArray(arr, arr.length,2);
		for(int i: arr){
		    System.out.print(i);
		    // output: 25461234
		}
	}
	public static void rotateArray(int[] a, int n, int k)
	{
		reverseArray(a,0,k-1);
		reverseArray(a,k,n-1);
		reverseArray(a,0,n-1);
	}
	public static void reverseArray(int[] a, int start, int end)
	{
		for(int i= start, j= end; i<=j;i++,j--)
		{
			int temp =a[i];
			a[i] = a[j];
			a[j]= temp;
		}
	}

}
