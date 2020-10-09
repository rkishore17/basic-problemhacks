package solutions;

//Problem: Determine the maximum value without taking the adjacent items.
// Solution: Dynamic Programming Approach.

/*
Example: 
Input : int[] arr = {5, 5, 10, 100, 10, 5};
Output : 110

Input : int[] arr = {1, 2, 3};
Output : 4
*/ 

public class Solution {
	
	public static int rob(int[] arrayItem, int len)
	{
		switch (len) {
		case 0:
			return 0;
			
		case 1:
			return arrayItem[0];
			
		case 2:
			return Math.max(arrayItem[0], arrayItem[1]);
			
		case 3:
			return arrayItem[0] + Math.max(arrayItem[1], arrayItem[2]);
		}
		
		int inclusive = Math.max(arrayItem[0], arrayItem[1]);
		int exclusive = 0;
		
		for(int i=2; i<arrayItem.length; i++)
		{
			int maxValue = Math.max(arrayItem[i], arrayItem[i] + exclusive);
			
			exclusive = inclusive;
			inclusive = maxValue;
		}
		return inclusive;
	}
	
	public static void main(String[] args) 
	{
		int[] arrayItem = {5, 5, 10, 100, 10, 5};
		int len = arrayItem.length;
		
		int resp = rob(arrayItem, len);		
		System.out.println(resp);
	}
}

