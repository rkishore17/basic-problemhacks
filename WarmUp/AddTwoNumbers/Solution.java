package solutions;

//Problem: Add the two numbers and return sum as list.

/*
Example: 
Input: l1 = [2,1,3], l2 = [3,8,5]
Output: [5,9,8]
Explanation: 213 + 385 = 598.

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
*/ 

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
	public List<Integer> addTwoNumbers(int[] a1, int[] a2, int len)
	{
		List<Integer> list = new ArrayList<>();
		
		if(a1.length == 0 || a2.length == 0)
			return null;
		
		int i = 0;
		int j = 0;
		int leadingValue = 0;
		
		while(i < len || j < len)
		{
			int sum = 0;
			if(i < a1.length && j < a2.length) {
				sum = a1[i] + a2[j] + leadingValue;
				if(sum > 9) {					
					list.add(reminder(sum));
					leadingValue = nextValue(sum);
				} else {
					leadingValue = 0;
					list.add(sum);
				}
			}
			
			if(i < a1.length && j >= a2.length) {
				sum = a1[i] + leadingValue;
				if(sum > 9) {					
					list.add(reminder(sum));
					leadingValue = nextValue(sum);
				} else {
					leadingValue = 0;
					list.add(sum);
				}
			}
			
			if(i >= a1.length && j < a2.length) {
				sum = a2[j] + leadingValue;
				if(sum > 9) {					
					list.add(reminder(sum));
					leadingValue = nextValue(sum);
				} else {
					leadingValue = 0;
					list.add(sum);
				}
			}
			i++;
			j++;
		}
		
		if(leadingValue > 0)
		{
			list.add(leadingValue);
		}
		
		return list;
	}
	
	public int reminder(int value) {
		int r = value % 10;
		return r;
	}
	
	public int nextValue(int value) {
		int q = value / 10;
		return q;
	}
	
	public static void main(String[] args)
	{	
		Practice p = new Practice();
		
		int[] a1 = {9, 9, 9, 9, 9, 9, 9};
		int[] a2 = {9, 9, 9, 9};
		int len = 0;
		
		if(a1.length > a2.length)
			len = a1.length;
		else len = a2.length;
		
		List<Integer> list = p.addTwoNumbers(a1, a2, len);
		System.out.println(list);
	}
}
