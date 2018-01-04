/**
 * @param {number} num
 * @return {boolean}
 */
var checkPerfectNumber = function(num) {
    var x = [];
    for(var i = 1; i < num; i++) {
        if(num % i == 0) x.push(i);
    }
    return x.length > 0 ? x.reduce((a,b) => a + b) == num : false;
};

console.log(checkPerfectNumber(28));