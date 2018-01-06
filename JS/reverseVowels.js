/**
 * @param {string} s
 * @return {string}
 */
var reverseVowels = function(s) {
    var vowels = s.split("").filter(x => x.match(/[aeiou]/i));
    if(vowels.length == 0) return s;
    var x = s.split("");  
    for(var i = 0; i < s.length; i++) {
        if(x[i].match(/[aeiou]/i)) {
            x[i] = vowels.pop();
        }
    }
    return x.join("");
};

console.log(reverseVowels("leetcode"));
console.log(reverseVowels("hello"));
console.log(reverseVowels("aA"));