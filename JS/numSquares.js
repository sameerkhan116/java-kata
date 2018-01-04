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
    while(n > 0) {
        if(n - x*x >= 0) n -= x*x;
        else x--;
        count++;
    }
    return count;
};

console.log(numSquares(14));
console.log(numSquares(13));
console.log(numSquares(12));