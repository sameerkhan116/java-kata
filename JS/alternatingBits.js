/**
 * @param {number} n
 * @return {boolean}
 */
var hasAlternatingBits = function(n) {
    n = (n >>> 0).toString(2).split("");
    for(var i = 0; i < n.length; i++) {
        if(!(n[i] != n[i+1])) {
            return false;
        }
    }
    return true;
}

console.log(hasAlternatingBits(5));
console.log(hasAlternatingBits(11));