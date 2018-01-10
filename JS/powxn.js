/**
 * @param {number} x
 * @param {number} n
 * @return {number}
 */
var myPow = function(x, n) {
    var temp = 0;
    if(n == 0) return 1;
    temp = myPow(x,parseInt(n/2));
    if(n % 2 == 0) return temp * temp;
    else {
        if(n > 0) return x * temp * temp;
        else return (temp * temp) / x;
    }
};

console.log(myPow(8.88023,3));
console.log(myPow(2,4));
console.log(myPow(34.00515,-3));
console.log(myPow(2,-3));
console.log(myPow(0.44894,-5));

