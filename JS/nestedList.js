var result = 0, depth = 1;

var nestedList = function(nums) {
    return helper(nums, 1);
};

var helper = function(nums, depth) {
    if(nums.length == 0 || nums == null) return 0;
    var sum = 0;
    for(var i = 0; i < nums.length; i++) {
        if(typeof(nums[i]) == 'number') sum += nums[i] * depth;
        else sum += helper(nums[i], depth + 1);
    }
    return sum;
};


console.log(nestedList([[1,1],2,[1,1]]));