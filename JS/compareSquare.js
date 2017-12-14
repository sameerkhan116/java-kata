function comp(a1,a2) {
    // console.log(a1,a2);
    if(a1 === null || a2 === null || a1.length !== a2.length) {
      return false;
    }
    // if(a1.length === 0 && a2.length === 0) {
    //     return true;
    // }
    
    // function sortMy(a,b) {
    //     return a - b;
    // }
    // a1.sort(sortMy);
    // a2.sort(sortMy);

    // while(a1.length > 0) {
    //     if(a2[0] === Math.pow(a1[0], 2)) {
    //         a1.shift();
    //         a2.shift();
    //     }
    //     else {
    //         return false;
    //     } 
    // }
    // return a1.length === 0 && a2.length === 0 ? true : false;
    // return false;
    a1.sort((a,b) => a - b);
    a2.sort((a,b) => a - b);
    return a1.map(v => v*v).every((v,i) => v == a2[i]);
}

console.log(comp([121, 144, 19, 161, 19, 144, 19, 11], [121, 14641, 20736, 361, 25921, 361, 20736, 361]));
console.log(comp([],[]))
console.log(comp([ 121, 144, 19, 161, 19, 144, 19, 11 ], [ 121, 14641, 20736, 36100, 25921, 361, 20736, 361 ]));