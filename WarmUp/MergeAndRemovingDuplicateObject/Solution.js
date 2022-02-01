//Problem: Removing duplicates from Object and merge with respective duplicates values.

/*
Example: 
Input : let arr = [
    { id: 1, items: ["one", "two"] },
    { id: 2, items: ["one", "two", "three"] },
    { id: 2, items: ["four", "five"] },
    { id: 1, items: ["one"] },
  ];

Output : 
[
  { id: 1, items: [ 'one', 'two', 'one' ] },
  { id: 2, items: [ 'one', 'two', 'three', 'four', 'five' ] }
]
*/ 

function mergeDuplicates(inputArrItem) {
  const duplicateArrValue = inputArrItem.filter((val, idx, arrItem) => {
    let itemIdx = arrItem.findIndex((el) => el.id === val.id);
    if (idx !== itemIdx) {
      arrItem[itemIdx].items.push(...arrItem[idx].items);
    }
    return idx === itemIdx;
  });
}

const arr = [
    { id: 1, items: ["one", "two"] },
    { id: 2, items: ["one", "two", "three"] },
    { id: 2, items: ["four", "five"] },
    { id: 1, items: ["one"] },
  ];
mergeDuplicates(arr);
