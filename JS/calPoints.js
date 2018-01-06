/**
 * @param {string[]} ops
 * @return {number}
 */
var calPoints = function(ops) {
    var x = [];
    for(var i = 0; i < ops.length; i++) {
        if(ops[i].match(/[0-9]+/)) {
            x.push(parseInt(ops[i]));
        }
        else if(ops[i] == "C") {
            x.pop();
        }
        else if(ops[i] == "D") {
            var a = x[x.length - 1];
            x.push(a*2);
        }
        else if(ops[i] == "+") {
            var a = x[x.length - 1], b = x[x.length - 2];
            x.push(a + b);
        }
    }
    return x.reduce((a,b) => a + b);
};

console.log(calPoints(["5","-2","4","C","D","9","+","+"]));
console.log(calPoints(["5","2","C","D","+"]));