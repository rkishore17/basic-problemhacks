package solutions;

//Problem: Find the length of the longest substring without repeating characters

/*
Example: 
Input : String str = "abcabcbb";
Output : The answer is "abc", with the length of 3

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1

Input: s = ""
Output: 0
*/ 

public class Solution {
	
	public static int lengthOfLongestSubstring(String str)
	{		
		int strLength = 1;

		if(str.length() == 0)
			return 0;
		
	    for (int i = 0; i < str.length(); i++) {
	        for (int j = i + 1; j <= str.length(); j++) {	        	
	        	String subStrValue = str.substring(i,j);   	
	        	if(subStrValue.length() > 1 && isUnique(subStrValue))
	        	{
	        		if(subStrValue.length() > strLength)
	        			strLength = subStrValue.length();
	        	}
        	}
        }	    
		return strLength;
	}
	
	//Validating the non-repeated characters 
	public static boolean isUnique(String s)
	{	
		Map<Character, Integer> map = new HashMap<>();
		for(int i=0; i<s.length(); i++)
		{
			if(!map.containsKey(s.charAt(i)))
			{
				map.put(s.charAt(i), 1);
			}
			else
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) 
	{		
		String str = "abcabcbb";
		
		int resp = lengthOfLongestSubstring(str);
		System.out.println(resp);
	}
}