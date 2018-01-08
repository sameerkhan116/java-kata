/**
 * @param {string[]} strs
 * @return {number}
 */
var findLUSlength = function(strs) {
    var largest = 0;
    for(var i = 0; i < strs.length; i++) {
        if(strs[i].length > largest) largest = strs[i].length;
    }
    var fin = strs.map(x => x.split("").sort((a,b) => a - b).join(""));
    fin = fin.filter((x,i) => fin.indexOf(x) == i);
    return strs.length == fin.length ? largest : - 1;
};

console.log(findLUSlength(["aba", "cdc", "eae"]));
console.log(findLUSlength(["aaa", "aaa", "aa"]));