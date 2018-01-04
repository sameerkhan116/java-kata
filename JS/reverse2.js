/**
 * @param {string} s
 * @param {number} k
 * @return {string}
 */
var reverseStr = function(s, k) {
    var re = new RegExp('.{1,' + 2*k + '}', 'g'), re2 = new RegExp('.{1,' + k + '}', 'g');
    return s.match(re).map(x => x.length < k ? x.split("").reverse().join("") : x.match(re2).map((x,i) => i == 0 ? x.split("").reverse().join("") : x).join("")).join("");
};

console.log(reverseStr("abcdefg", 2));