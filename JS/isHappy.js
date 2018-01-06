/**
 * @param {number} n
 * @return {boolean}
 */
var isHappy = function(n) {
    var prod = function(x) {
        x = x.toString().split("").map(x => parseInt(x));
        var sum = 0;
        for(var i = 0; i < x.length; i++) {
            sum += x[i]*x[i];
        }
        return sum;
    }

    var x = [];
    while(n != 1) {
        if(x.indexOf(prod(n)) == -1) {
            x.push(prod(n));
            n = prod(n);
        }
        else {
            return false;
        }
    }
    return true;
};

console.log(isHappy(20));