/**
 * @param {number} num
 * @return {number[]}
 */
var countBits = function(num) {
    var x = [];
    for(var i = 0; i <= num; i++) x.push(i);
    return x.map(x => x.toString(2)).map(x => x.split("").reduce((a,b) => parseInt(a) + parseInt(b))).map(x => parseInt(x));
};

console.log(countBits(5));