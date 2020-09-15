//Problem: Given an array of number. Need to sort the values by ascending order.

/*
Example:
Input: 1,3,5,3,2,4
Output: 1,2,4,5,3,3
*/

function SortingByValue(arrValue) {
  let map = new Map();
  const result = [];

  arrValue.sort((a, b) => a - b);

  for (let i = 0; i < arrValue.length; i++) {
    if (map.has(arrValue[i])) {
      let freq = map.get(arrValue[i]);
      map.set(arrValue[i], ++freq);
    } else {
      map.set(arrValue[i], 1);
    }
  }

  let valueSort = [...map.entries()].sort((a, b) => a[1] - b[1]);

  for (let [key, value] of valueSort) {
    for (let i = 0; i < value; i++) {
      result.push(key);
    }
  }

  console.log(result);
}
const item = [1, 5, 3, 5, 2, 4, 6, 2, 3, 2];
SortingByValue(item);
