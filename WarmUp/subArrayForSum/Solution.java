package solutions;

//Problem: Finding the subArray for the given sum

/*
Example: 
Input : [3,4,7,2,-3,1,4,2,1] , Given: 8;
Output : [5,9]
*/ 

public class subArray {  
	
	public static int findSubArray(int[] inputArray, int inputNumber)
    {
		int sum = 0;
		
		for(int i=0; i<inputArray.length; i++)
		{
			sum = inputArray[i];
			
			for(int j=i+1; j<=inputArray.length; j++)
			{
				if(sum == inputNumber)
				{
					System.out.println("SubArray found at " + i + ":" + j + " position");
					return 1;
				}
				
				if(sum > inputNumber || j == inputArray.length)
					break;
					sum += inputArray[j];
			}
		}
		return 0;
    }
	
	public static void main(String[] args) 
	{
		int array[] = {3,4,7,2,-3,1,4,2,1};
		int given = 8;
		findSubArray(array, given);
	}
}
