/**
 * @param {number} n
 * @return {number}
 */
var numSquares = function(n) {

    var arr = new Array(n + 1);
    arr.fill(Number.MAX_SAFE_INTEGER);
    arr[0] = 0;
    for(var i = 0; i <= n; i++){
        for(var j = 1; j * j <= i; j++){
            arr[i] = Math.min(arr[i], arr[i - j * j] + 1);
        }
    }
    return arr[n];
};

console.log(numSquares(13));
console.log(numSquares(12));
console.log(numSquares(43));

