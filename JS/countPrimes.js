/**
 * @param {number} n
 * @return {number}
 */
var countPrimes = function(n) {
    var isPrime = function(x) {
        if(x == 2) return true;
        if(x % 2 == 0) {
            return false;
        }
        for(var i = 3; i*i <= x; i += 2) {
            if(x % i == 0) return false;
        }
        return true;
    }
    var count = 0;
    for(var i = 2; i < n; i++) {
        if(isPrime(i)) count++;
    }

    return count;
};

console.log(countPrimes(7));