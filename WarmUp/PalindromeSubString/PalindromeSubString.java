package solutions;

//Problem: Finding the highest palindrome subString

/*
Example: 
Input : "helloJava"
Output : "ava"
*/

public class PalindromeSubString {  
	
    public String longestPalindrome(String str) {
        String longestString = "";
		
	if(str.length() == 0) {
	    return longestString;
        } else if(str.length() == 1) {
            return str;
        }
        
	for (int i = 0; i < str.length(); i++) {
	  for (int j = i + 1; j <= str.length(); j++) {
	     String subStrValue = str.substring(i,j);   	
		if (isPalindrome(subStrValue)) {
		    if(subStrValue.length() > longestString.length()) {
			longestString = subStrValue;
		     }
		   }
		}
	    }
        return longestString;
    }
    
    public static boolean isPalindrome(String s) {
	StringBuilder sb = new StringBuilder(s).reverse();
	if(sb.toString().equals(s)) {
	    return true;
	}
	  return false;
    }
    
    public static void main(String[] args) {		
	String str = "yzwhuvljgkbxonhkpnxldwkaiboqoflbotqamsxyglfqniflcrtsxbsxlwmxowwnnxychyrjedlijejqzsgwakzohghpxgamecmhcalfoyjtutxeciwqupwlxrgdcpfvybskrytvmwkvnbdjitmohjavhmjobudvbsnkvszyrahpanocltwzeubgxkkthxhjgvcvygfkjctkubtjdocncmjzmxujetybdwmqutvrrulhlsbcbripctbkacwoutkrqsohiihiegqqlasykkgjjskgphieofsjlkkmvwcltgjqbpakercxypfcqqsmkowmgjglbzbidapmqoitpzwhupliynjynsdfncaosrfegquetyfhfqohxytqhjxxpskpwxegmnnppnnmgexwpkspxxjhqtyxhoqfhfyteuqgefrsoacnfdsnyjnyilpuhwzptioqmpadibzblgjgmwokmsqqcfpyxcrekapbqjgtlcwvmkkljsfoeihpgksjjgkkysalqqgeihiihosqrktuowcakbtcpirbcbslhlurrvtuqmwdbytejuxmzjmcncodjtbuktcjkfgyvcvgjhxhtkkxgbuezwtlconapharyzsvknsbvdubojmhvajhomtijdbnvkwmvtyrksbyvfpcdgrxlwpuqwicextutjyoflachmcemagxphghozkawgszqjejildejryhcyxnnwwoxmwlxsbxstrclfinqflgyxsmaqtoblfoqobiakwdlxnpkhnoxbkgjlvuhwzy";
    
	Solution solution = new Solution();
	String resp = solution.longestPalindrome(str);
	System.out.println(resp);
    }
}
