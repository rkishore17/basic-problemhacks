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
  let uniqueArrObject = [];
  
  let duplicateArrValue = inputArrItem.filter((val, idx, arrItem) => {
    let itemIdx = arrItem.findIndex((el) => el.id === val.id);
    if (idx === itemIdx) {
      uniqueArrObject.push(arrItem[itemIdx]);
    }
    return idx !== itemIdx;
  });

  for (let i = 0; i < uniqueArrObject.length; i++) {
    for (let j = 0; j < duplicateArrValue.length; j++) {
      if (uniqueArrObject[i].id === duplicateArrValue[j].id) {
        uniqueArrObject[i].items.push(...duplicateArrValue[j].items);
      }
    }
  }

  console.log(uniqueArrObject);
}

const arr = [
    { id: 1, items: ["one", "two"] },
    { id: 2, items: ["one", "two", "three"] },
    { id: 2, items: ["four", "five"] },
    { id: 1, items: ["one"] },
  ];
mergeDuplicates(arr);