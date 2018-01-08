/**
 * @param {number[]} nums
 * @return {number}
 */
var findDuplicate = function(nums) {
    var result = 0;
    var x = nums.sort((a,b) => a - b);
    for(var i = 0; i < nums.length - 1; i++) {
        if(nums[i] == nums[i+1]) return nums[i];
    }
    return -1;
};

console.log(findDuplicate([1,2,3,4,5,6,6]));
console.log(findDuplicate([1,1,2,3,4,5]));