package solutions;

//Problem: Finding the Anagram from two string with Time Complexity of O(n) and Space is O(1).

/*
Example: 
Input : str1 = "company", str2 = "pacomny"
Output : true
*/ 

public class Anagram {
	
	public static boolean anagram(String s1, String s2)
	{
		if(s1.length() != s2.length())
			return false;
		
		int[] charArrCount = new int[26];
		for(int i=0; i<s1.length(); i++)
		{
			charArrCount[s1.charAt(i) - 'a'] ++;
			charArrCount[s2.charAt(i) - 'a'] --;
		}
		
		for(int count : charArrCount)
		{
			if(count != 0)
			{
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) 
	{		
		String s1 = "company";
		String s2 = "pacomny";
		
		boolean bool = anagram(s1, s2);
		if(bool)
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not Anagram");			
		}
	}
}
