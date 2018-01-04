/**
 * @param {number} num
 * @return {number}
 */
var findComplement = function(num) {
    return parseInt(parseInt((num >>> 0).toString(2).split("").map(x => x == 0 ? 1 : 0).join(""), 2).toString(10));
};

console.log(findComplement(1));