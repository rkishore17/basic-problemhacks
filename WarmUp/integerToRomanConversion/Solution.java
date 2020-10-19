package solutions;

//Problem: Convert the given Integer to Roman numerals. Given range is between 0 to 3999
//Solution: Applied Math.

/*
Example: 
Input : 55
Output : LV

Input: num = 58
Output: "LVIII"

Input: num = 1994
Output: "MCMXCIV"
Explanation: M-1000, CM-900, XC-90, IV-4
*/ 

public class Solution {
	
	public static String intToRoman(int num) {
		final String[] romanNumber = {"I", "V", "X", "L", "C", "D", "M"};	
		
		if(num < 0 || num > 3999)
			return "";
			
		int[] digits = String.valueOf(num).chars().map(Character::getNumericValue).toArray();
		int len = digits.length;
		StringBuilder sb = new StringBuilder();
				
		for(int i=0; i<len; i++)
		{
			String romanSymbolResp = "";
			String padZeros = "";
			
			int units = len-1-i;
			
			//units is used to ensure whether the number is tens,hundred or thousand
			if(units != 0)
			{
				padZeros = String.format("%0"+ units +"d", 0);
			}
			
			int number = Integer.parseInt(digits[i] + padZeros);
			if(number >= 1000 && number <= 3000 ) {
				romanSymbolResp = loop(0, digits[i], romanNumber[6]);
				sb.append(romanSymbolResp);
			} else if((number >= 100 && number <= 300) || number == 900 ) {
				if(digits[i] == 9)
				{
					sb.append(romanNumber[4] + romanNumber[6]);
				} else {
					romanSymbolResp = loop(0, digits[i], romanNumber[4]);
					sb.append(romanSymbolResp);
				}
			} else if(number >= 400 && number <= 800) {
				int idx = digits[i] - 5;
				if(idx == -1) {					
					romanSymbolResp = loop(idx, 0, romanNumber[4]);
					sb.append(romanSymbolResp + romanNumber[5]);
				} else {
					romanSymbolResp = loop(0, idx, romanNumber[4]);
					sb.append(romanNumber[5] + romanSymbolResp);
				}
			} else if((number >= 10 && number <= 30) || number == 90) {
				if(digits[i] == 9)
				{
					sb.append(romanNumber[2] + romanNumber[4]);
				} else {
					romanSymbolResp = loop(0, digits[i], romanNumber[2]);
					sb.append(romanSymbolResp);
				}
			} else if(number >= 40 && number <= 80) {
				int idx = digits[i] - 5;
				if(idx == -1) {
					romanSymbolResp = loop(idx, 0, romanNumber[2]);
					sb.append(romanSymbolResp + romanNumber[3]);
				} else {
					romanSymbolResp = loop(0, idx, romanNumber[2]);
					sb.append(romanNumber[3] + romanSymbolResp);
				}
			} else if((number >= 1 && number <= 3) || number == 9) {
				if(digits[i] == 9)
				{
					sb.append(romanNumber[0] + romanNumber[2]);
				} else {					
					romanSymbolResp = loop(0, digits[i], romanNumber[0]);
					sb.append(romanSymbolResp);
				}
			} else if(number >= 4 && number <= 8) {
				int idx = digits[i] - 5;
				if(idx == -1) {
					romanSymbolResp = loop(idx, 0, romanNumber[0]);
					sb.append(romanSymbolResp + romanNumber[1]);
				} else {
					 romanSymbolResp = loop(0, idx, romanNumber[0]);
					 sb.append(romanNumber[1] + romanSymbolResp);
				}
			}
		}
		return sb.toString();
	}
	
	public static String loop(int idx, int num, String symbol)
	{
		StringBuilder sb = new StringBuilder();
		for(int i=idx; i<num; i++)
		{
			sb.append(symbol);
		}
		return sb.toString();
	}
	
	public static void main(String[] args)
	{
		int digit = 5;
		
		String romanDigits = intToRoman(digit);
		System.out.println(romanDigits);		
	}
}
