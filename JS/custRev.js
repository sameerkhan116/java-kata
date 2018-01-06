/**
 * @param {string} s
 * @return {string}
 */
var reverseString = function(s) {
    var a = s.length - 1;
    s = s.split("");
    for(var i = 0; i < s.length / 2; i++) {
        var temp = s[i];
        s[i] = s[a];
        s[a] = temp;
        a--;
    }
    return s.join("");
};

console.log(reverseString("hellos"));