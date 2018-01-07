/**
 * @param {number[][]} nums
 * @param {number} r
 * @param {number} c
 * @return {number[][]}
 */
var matrixReshape = function(nums, r, c) {
    var tot = [];
    nums.map(x => x.map(a => tot.push(a)));
    if(tot.length < r * c) return nums;
    var fin = [];
    for(var i = 0; i < r; i++) {
        var x = [];
        for(j = 0; j < c; j++) {
            x.push(tot.shift());
        }
        fin.push(x);
    }
    return fin;
};

console.log(matrixReshape([[1,2],[3,4]], 1, 3));
console.log(matrixReshape([[1,2],[3,4]], 2, 4));