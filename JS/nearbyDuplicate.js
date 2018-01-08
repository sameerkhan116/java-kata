/**
 * @param {number[]} nums
 * @param {number} k
 * @return {boolean}
 */
var containsNearbyDuplicate = function(nums, k) {
    var x = new Set();
    for(var i = 0; i < nums.length; i++) {
        if(x.add(nums[i]) == false) return true;
        if(x.size == k + 1) x.delete(nums[i - k]);
    }
    return false;
};

console.log(containsNearbyDuplicate([99,99],2));
console.log(containsNearbyDuplicate([-1,-1],1));
console.log(containsNearbyDuplicate([2,2],3));
console.log(containsNearbyDuplicate([1,0,1,1],1));