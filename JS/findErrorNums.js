/**
 * @param {number[]} nums
 * @return {number[]}
 */
var findErrorNums = function(nums) {
    var x = nums[0];
    for(var i = 0; i < nums.length; i++) {
        if(x != nums[i]) return [nums[i], i];
        x++;
    }
    return [];
};

console.log(findErrorNums([1,2,2,4]));
console.log(findErrorNums([1,1]));