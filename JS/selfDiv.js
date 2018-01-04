var selfDividingNumbers = function(left, right) {
    var x = [];
    for(var i = left; i <= right; i++) i.toString().split("").map(x => i % parseInt(x)).reduce((a,b) => a + b) == 0 ? x.push(i) : null;
    return x;
};

console.log(selfDividingNumbers(1,22));