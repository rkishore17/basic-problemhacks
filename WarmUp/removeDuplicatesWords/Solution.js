//Problem: Removing the duplicates by words or characters.

/*
Example:
Input: "A long lived wolf, lived in himalayas"
Output: "A long lived wolf, in himalayas"
*/

//Here, we can remove by characters wise, by removing the split method and converting string to charArr.

function removeDuplicates(sentence) {
  let strArr = sentence.split(" ");

  let map = new Map();

  for (let i = 0; i < strArr.length; i++) {
    if (!map.has(strArr[i])) {
      map.set(strArr[i], 1);
    }
  }

  for (let [k] of map) console.log(k);
}
let strValue = "A long lived wolf, lived in himalayas";
// let strValue = "codeForBetterWorld".toLowerCase();
removeDuplicates(strValue);

