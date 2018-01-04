/**
 * @param {number} n - a positive integer
 * @return {number} - a positive integer
 */
var reverseBits = function(n) {
    return (("00000000000000000000000000000000" + (n >>> 32).toString(2)).slice(-32)).split("").reduce((sum, number, index) => sum += (number * Math.pow(2,index)), 0);
};

console.log(reverseBits(43261596));
// console.log(reverseBits());