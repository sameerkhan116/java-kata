/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {
    var x = s.toLowerCase().replace(/[^0-9a-z]/g, "");
    return x.split("").reverse().join("") == x;
};

console.log(isPalindrome("A man, a plan, a canal: Panama"));
console.log(isPalindrome("0P"));
