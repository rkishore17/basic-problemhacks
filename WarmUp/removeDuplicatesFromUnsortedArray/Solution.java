package solutions;

//Problem: Removing duplicates from Unsorted array and display it in Sorted way.

/*
Example: 
Input : int[] arr = {3, 5, 1, 2, 8, 3};
Output : [1, 2, 3, 5, 8]
*/ 

public class Solution {
	
	public static void duplicates(int[] arr)
	{
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<arr.length; i++)
		{
			if(!map.containsKey(arr[i]))
			{
				map.put(arr[i], 1);
			}
		}

		map.forEach((k,v) -> System.out.println(k));
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {3, 5, 1, 2, 8, 3};
		
		duplicates(arr);
	}
}