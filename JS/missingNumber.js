/**
 * @param {number[]} nums
 * @return {number}
 */
var missingNumber = function(nums) {
    var b = 0;
    nums = nums.sort((a,b) => a - b);
    for(var i = 0; i < nums.length + 1; i++) {
        if(i != nums[i]) return i;
    }
};

console.log(missingNumber([3,0,1]));
console.log(missingNumber([0,1]));
console.log(missingNumber([9,6,4,2,3,5,7,0,1]));