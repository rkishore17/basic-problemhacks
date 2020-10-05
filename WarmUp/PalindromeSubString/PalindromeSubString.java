package solutions;

//Problem: Finding the palindrome subString

/*
Example: 
Input : "helloJava"
Output : "ll, ava"
*/ 

import java.util.HashSet;
import java.util.Set;

public class PalindromeSubString {  
	
	public static Set<String> palindromeString(String str)
	{		
		Set<String> set = new HashSet<>();
		
	    for (int i = 0; i < str.length(); i++) {
	        for (int j = i + 1; j <= str.length(); j++) {
	        	if (isPalindrome(str.substring(i, j))) {
	        		set.add(str.substring(i,j));
	        	}
	        }
	    }
	    
	    return set;
	}
	
	public static boolean isPalindrome(String s)
	{
		StringBuilder sb = new StringBuilder(s).reverse();
		if(sb.length() > 1)
		{
			return (sb.toString().equals(s));			
		}
		return false;
	}
	
	public static void main(String[] args) 
	{
		String str = "helloJava";
		
		Set<String> result = palindromeString(str.toLowerCase());
		
//		String longestString = "";
//		for(String s : s1)
//		{
//			if(s.length() > longestString.length())
//			{
//				longestString = s;
//			}
//		}
		System.out.println(result);
	}
}
