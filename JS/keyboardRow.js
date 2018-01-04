/**
 * @param {string[]} words
 * @return {string[]}
 */
var findWords = function(words) {
    return words.filter(x => x.match(/[qwertyuiop]+$|[asdfghjkl]+$|[zxcvbnm]+$/gi).join("") == x);
};

console.log(findWords(["Hello", "Alaska", "Dad", "Peace"]));