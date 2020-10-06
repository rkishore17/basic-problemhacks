//Problem: Merge Two Sorted Array into Single Array

/*
Example: 
Input : s1 = [1, 3, 5, 8], s2 = [2, 4, 6];
Output : [1, 2, 3, 4, 5, 6, 8]
*/ 

function SingleSort(s1, s2) {
	let arrSize = s1.length + s2.length;

	let concatedArray = [];
	let i = 0, j = 0;

	while (concatedArray.length != arrSize) {
		if (i < s1.length && j < s2.length) {
			if (s1[i] >= s2[j]) {
				concatedArray.push(s2[j]);
				j++;
			}
		} else if (j < s2.length) {
			concatedArray.push(s2[j]);
			j++;
		}

		if (j < s2.length && i < s1.length) {
			if (s2[j] >= s1[i]) {
				concatedArray.push(s1[i]);
				i++;
			}
		} else if (i < s1.length) {
			concatedArray.push(s1[i]);
			i++;
		}
	}
	console.log(concatedArray);
}
let s1 = [1, 3, 5];
let s2 = [2, 4, 6];
SingleSort(s1, s2);
