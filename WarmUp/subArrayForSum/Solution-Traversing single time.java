package solutions;

//Problem: Finding the subArray for the given sum
// Sorting by Single Traversal

/*
Example: 
Input : [3,4,7,2,-3,1,4,2,1] , Given: 9;
Output : [2, 4]
*/ 

public class subArray {  
	
	public static int findSubArray(int[] inputArray, int inputNumber, int len)
    {
		int sum = inputArray[0];
		int startIdx = 0;
		
		for(int i=1; i<len; i++)
		{
			while(sum > inputNumber)
			{
				sum -= inputArray[startIdx];
				startIdx ++;
			}
			
			if(inputArray[i] == inputNumber || inputArray[0] == inputNumber)
			{
				System.out.println("SubArray found at: " + i + " position");
			}
						
			if(i < len) {
				sum += inputArray[i];
			}
			
			if(sum == inputNumber)
			{
				int idx = i+1;
				System.out.println("SubArray found at: " + startIdx + " and " + idx + " position");
			}
		}
		return 1;
    }
	
	public static void main(String[] args) 
	{
		int array[] = {3, 4, 7, 2, -3, 1, 4, 2, 1};
		int len = array.length;
		int given = 9;
		findSubArray(array, given, len);
	}
}
