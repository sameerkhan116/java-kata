/**
 * @param {number} n - a positive integer
 * @return {number}
 */
var hammingWeight = function(n) {
    return parseInt(n).toString(2).split("").filter(x => x != '0').map(x => parseInt(x)).reduce((a,b) => a + b);
};

console.log(hammingWeight(00000000000000000000000000000001));
console.log(hammingWeight(00000000000000000000000000001011));