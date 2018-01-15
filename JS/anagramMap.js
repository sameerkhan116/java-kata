/**
 * @param {number[]} A
 * @param {number[]} B
 * @return {number[]}
 */
var anagramMappings = function(A, B) {
    var x = [];
    for(var i = 0; i < A.length; i++) {
        x.push(B.indexOf(A[i]));
    }
    return x;
};

console.log(anagramMappings([12, 28, 46, 32, 50],[50, 12, 32, 46, 28]));