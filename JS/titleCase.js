function titleCase(title, minorWords) {
    if(minorWords) {
        minorWords = minorWords.split(" ").map(x => x.toLowerCase());
        title = title.split(" ").map(x => x.charAt(0).toUpperCase() + x.substr(1).toLowerCase());
        title = (title[0] + ' ' + title.slice(1).map(x => minorWords.indexOf(x.toLowerCase()) >= 0 ? x.toLowerCase() : x.charAt(0).toUpperCase() + x.substr(1).toLowerCase()).join(' ')).trim();
    }
    else {
        title = title.split(" ").map(x => x.toLowerCase()).map(x => x.charAt(0).toUpperCase() + x.substr(1)).join(" ");
    }
    return title;
}

console.log(titleCase('a clash of KINGS', 'a an the of'));
console.log(titleCase('First a of in', 'an often into'));
console.log(titleCase('THE WIND IN THE WILLOWS', 'The In'));
console.log(titleCase('A bc', 'bc'));