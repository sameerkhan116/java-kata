/**
 * @param {number[]} nums
 * @return {number}
 */
var maxProduct = function(nums) {
    if(nums.length == 0) return 0;
    var minherepre = nums[0], maxherepre = nums[0], maxsofar = nums[0], maxhere, minhere;
    for(var i = 1; i < nums.length; i++) {
        maxhere = Math.max(Math.max(maxherepre * nums[i], minherepre * nums[i]), nums[i]);
        minhere = Math.min(Math.min(maxherepre * nums[i], minherepre * nums[i]), nums[i]);
        maxsofar = Math.max(maxhere, maxsofar);
        maxherepre = maxhere;
        minherepre = minhere;
    }
    return maxsofar;
};

console.log(maxProduct([2,3,-2,4]));
console.log(maxProduct([-2]));
console.log(maxProduct([0,2]));

