/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNumber = function(nums) {
    // var dict = {};
    // nums.map(x => dict[x] = 0);
    // nums.map(x => dict[x] += 1);
    // for(key in dict) {
    //     if(dict[key] == 1) return parseInt(key);
    // }
    // return;

    return parseInt(nums.filter(x => nums.indexOf(x) == nums.lastIndexOf(x)).join(""));
};

console.log(singleNumber([3,3,3,1,2,2,2,4,4,4,6,6,6]));