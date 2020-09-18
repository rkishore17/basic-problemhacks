package solutions;

public class BinarySearch {  
	
	public static int binarySearch(int arr[], int left, int right, int val)
	{
		if(right >= left)
		{
			int mid = left + (right - left) / 2 ;
			
			if(arr[mid] == val)
				return mid;
			
			if(arr[mid]	> val)
			{
				return binarySearch(arr, left, mid-1, val);
			}
			else
			{
				return binarySearch(arr, mid+1, right, val);
			}
		}
		return -1;
	}
	
	public static void main(String[] args) 
	{
		int[] arr = { 2, 3, 4, 10, 40 };
		int len = arr.length;
		int elem = 10;
		
		int idx = binarySearch(arr, 0, len, elem);
		if(idx == -1) {
			System.out.println("No item found");
		} else {
			System.out.println("Item found at: " + idx + " position");
		}
	}
}
