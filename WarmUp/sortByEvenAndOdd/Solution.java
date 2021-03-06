package solutions;

//Problem: Segerate the array of value into even and odd. Sort it in ascending order from even to odd number.

/*
Example: 
Input : [3, 4, 5, 1, 2]
Output : 2,4,1,3,5
*/ 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	
	public static void sortByEvenAndOdd(int[] arr)
	{
		Arrays.sort(arr);
		
		List<Integer> evenList = new ArrayList<>();
		List<Integer> oddList = new ArrayList<>();
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 2 == 0) {
				evenList.add(arr[i]);
			} else {
				oddList.add(arr[i]);
			}
		}
		
		List<Integer> finalList = new ArrayList<>();
		finalList.addAll(evenList);
		finalList.addAll(oddList);
		
		finalList.stream().forEach(el -> System.out.print(el + " "));
	}
	
	public static void main(String[] args) 
	{		
		int[] arr = {3,5,1,2,4};
		sortByEvenAndOdd(arr);
	}
}
