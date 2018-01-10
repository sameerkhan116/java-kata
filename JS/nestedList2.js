var nestedList = function(nums) {
    var depth = helper(nums);
    return sums(nums, depth);
};

var sums = function(nums, depth) {
    if(nums.length == 0 || nums == null) return 0;
    var sum = 0;
    for(var i = 0; i < nums.length; i++) {
        if(typeof(nums[i]) == 'number') sum += nums[i] * depth;
        else sum += sums(nums[i], depth - 1);
    }
    return sum;
}

var helper = function(nums) {
    if(nums.length == 0 || nums == null) return 0;
    var max = 0;
    for(var i = 0; i < nums.length; i++) {
        if(typeof(nums[i]) == 'number') max = Math.max(max, 1);
        else max = Math.max(max, helper(nums[i]) + 1);
    }
    return max;
}

console.log(nestedList([1,[4,[6]]]));
console.log(nestedList([[1,1],2,[1,1]]));

