package solutions;

//Problem: Find minimum sum from given digit, by swaping only 2 values.

/*
Example: 
Input : 97826453
Output : 27896453
*/ 

public class minimumSum {
	
	public static void minSum(int digit)
	{
		//Converting digit into Array of Integer.
		int[] arr = String.valueOf(digit).chars().map(Character :: getNumericValue).toArray();

		int minimunValue = arr[0];
		int position = 0;

		for(int i=1; i<arr.length; i++) {
			if(arr[i] == 1) {
				minimunValue = arr[i];
				position = i;
				break;
			}
	
			if(arr[i] < minimunValue) {
				minimunValue = arr[i];
				position = i;
			}
		}
		
		int temp = arr[0];
		arr[0] = minimunValue;
		arr[position] = temp;
		
		for(Integer i : arr)
			System.out.print(i);
	}
	
	public static void main(String[] args) 
	{		
		int digit = 97826453;
		minSum(digit);
	}
}
