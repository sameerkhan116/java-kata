/**
 * @param {number} n
 * @return {number}
 */
var numSquares = function(n) {
    var x = 1, p = [], count = 0;
    while(x*x < n) {
        p.push(x * x);
        x++;
    }
    x -= 1;
    var arr = [];
    while(n > 0) {
        if(n - x*x >= 0) {
            n -= x*x;
            arr.push(x*x);
        }
        else x--;
    }
    return arr;
};

console.log(numSquares(14));
console.log(numSquares(13));
console.log(numSquares(12));