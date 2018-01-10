/**
 * @param {number[]} findNums
 * @param {number[]} nums
 * @return {number[]}
 */
var nextGreaterElement = function(findNums, nums) {

    var nextGreat = function(num) {
        var next = 0;
        if(nums[nums.indexOf(num) + 1] != undefined) next = nums.slice(nums.indexOf(num) + 1).sort((a,b) => b - a)[0];
        return next;
    }

    var x = [];
    for(var i = 0; i < findNums.length; i++) {
        if(nums[nums.indexOf(findNums[i]) + 1] > findNums[i]) x.push(nums[nums.indexOf(findNums[i]) + 1]);
        else if(nextGreat(findNums[i]) > findNums[i]) x.push(nextGreat(findNums[i]));
        else x.push(-1);
    }
    return x;
};

console.log(nextGreaterElement([2,4], [1,2,3,4]));
console.log(nextGreaterElement([4,1,2], [1,3,4,2]));
console.log(nextGreaterElement([1,3,5,2,4], [6,5,4,3,2,1,7]));