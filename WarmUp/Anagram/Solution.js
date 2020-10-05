//Problem: Finding the Anagram from two string with Time Complexity of O(n) and Space is O(1).
//Solution: Take ASCII value and perform addition and subtraction.

/*
Example: 
Input : str1 = "javascript", str2 = "riptjavacs"
Output : true
*/ 

function Anagram(s1, s2) {
  let anagSize = 0;
  if (s1.length !== s2.length) return console.log("Not Anagram");

  for (let i = 0; i < s1.length; i++) {
    anagSize += s1[i].charCodeAt();
    anagSize -= s2[i].charCodeAt();
  }

  if (anagSize === 0) {
    console.log("Anagram");
  } else {
    console.log("Not Anagram");
  }
}
let str1 = "javascript";
let str2 = "riptjavacs";
Anagram(str1, str2);
