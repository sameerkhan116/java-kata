function disemvowel(str) {
    var vowels = ['a','e','i','o','u'];
    return str.split('')
            .filter(x => !(vowels.includes(x.toLowerCase())))
            .join('');
}

console.log(disemvowel("This website is for losers LOL!"));