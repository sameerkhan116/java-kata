/**
 * @param {number} num
 * @return {boolean}
 */
var isPerfectSquare = function(num) {
    var i = 0;
    while((i * i) <= num) {
        i++;
    }
    i -= 1;
    return (i * i) == num;
};

console.log(isPerfectSquare(16));
console.log(isPerfectSquare(14));
