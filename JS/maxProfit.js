var maxProfit = function(nums) {
    var maxCur = 0, maxsofar = 0;
    for(var i = 1; i < nums.length; i++){
        maxCur = Math.max(0, maxCur += nums[i] - nums[i - 1]);
        maxsofar = Math.max(maxCur, maxsofar);
    }
    return maxsofar;
};

console.log(maxProfit([7, 1, 5, 3, 6, 4]));
console.log(maxProfit([7, 6, 4, 3, 1]));