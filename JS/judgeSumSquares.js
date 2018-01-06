/**
 * @param {number} c
 * @return {boolean}
 */
var judgeSquareSum = function(c) {
    var i = 0, j = Math.floor(Math.sqrt(c));
    while(i <= j) {
        if((i * i + j * j) < c) i++;
        else if((i * i + j * j) > c) j--;
        else return true;
    }
    return false;
};

console.log(judgeSquareSum(5));
console.log(judgeSquareSum(3));