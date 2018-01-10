/**
 * @param {string} word
 * @return {boolean}
 */
var detectCapitalUse = function(word) {
    return word.toLowerCase().toUpperCase() == word || word.toLowerCase().toLowerCase() == word || (word.toLowerCase().substring(0,1).toUpperCase() + word.toLowerCase().substring(1)) == word;
};



console.log(detectCapitalUse("USA"));
console.log(detectCapitalUse("leetcode"));
console.log(detectCapitalUse("FlaG"));