function reverseWords(str) {
    return str.split(' ').map(x => x.split('').reverse().join('')).join(' ');
}

console.log(reverseWords("This is an example!"));