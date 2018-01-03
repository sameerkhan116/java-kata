function cubeOdd(arr) {
    return arr.length > 0 ? (arr.filter(x => typeof x == 'string').length > 0 ? undefined : arr.map(x => x*x*x).filter(x => x % 2 != 0).reduce((a,b) => a + b)) : undefined;
}

console.log(cubeOdd([1,2,3,4]));
console.log(cubeOdd([-3,-2,2,3]));
console.log(cubeOdd(["a",12,9,"z",42]));