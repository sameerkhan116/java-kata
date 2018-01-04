/**
 * @param {number[]} nums
 * @return {number}
 */
var arrayPairSum = function(nums) {
    return nums.sort((a, b) => a - b).map((x, i) => i % 2 != 0 ? 0 : x).reduce((a,b) => a + b);
};

console.log(arrayPairSum([1,4,3,2]));
console.log(arrayPairSum([5,6,7,8,9,10]));
