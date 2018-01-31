var findErrorNums = function(nums) {
    var arr = [], nums = nums.sort((a,b) => a-b);

    for(var i = 0; i < nums.length; i++) {
        if(nums.indexOf(nums[i]) != nums.lastIndexOf(nums[i])) {
            arr.push(nums[i]);
            break;
        }
    }

    for(var i = 1; i <= nums.length; i++) {
        if(!nums.includes(i)) {
            arr.push(i);
            break;
        }
    }

    return arr;
};

console.log(findErrorNums([1,2,2,4]));
console.log(findErrorNums([1,1]));
console.log(findErrorNums([3,2,2]));
console.log(findErrorNums([3,2,3,4,6,5]));
console.log(findErrorNums([1,5,3,2,2,7,6,4,8,9]));

