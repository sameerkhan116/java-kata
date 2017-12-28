function mix(s1, s2) {
    var string1 = {};
    var string2 = {};
    var one = [], two = [], eq = [];
    var fin = [];
    /* Split the two strings and count the chars in each string */
    s1 = s1.replace(/[^a-z]/g, "").split("").sort((a,b) => a.charCodeAt(0) - b.charCodeAt(0));
    s1.filter((x, i) => s1.indexOf(x) == i).map(x => string1[x] = 0);
    s1.map(x => string1[x] += 1);
    s2 = s2.replace(/[^a-z]/g, "").split("").sort((a,b) => a.charCodeAt(0) - b.charCodeAt(0));
    s2.filter((x, i) => s2.indexOf(x) == i).map(x => string2[x] = 0);
    s2.map(x => string2[x] += 1);
    /* Get all required strings */
    for(key in string1) {
        if(string1[key] > string2[key]) {
            if(string1[key] > 1) {
                one.push("1:" + key.repeat(string1[key]));
            }
        }
        else if(string1[key] > 1 && !(string2.hasOwnProperty(key))) {
            one.push("1:" + key.repeat(string1[key]))
        }
    }

    for(key in string2) {
        if(string1[key] < string2[key]) {
            if(string2[key] > 1) {
                two.push("2:" + key.repeat(string2[key]));
            }
        }
        else if(string2[key] > 1 && (!string1.hasOwnProperty(key))) {
            two.push("2:" + key.repeat(string2[key]));
        }
    }

    for(key in string1) {
        if(string1[key] == string2[key]) {
            if(string2[key] > 1) {
                eq.push("=:" + key.repeat(string1[key]));
            }
        }
    }

    var mySort = ((a,b) => a.charCodeAt(2) - b.charCodeAt(2));

    // return (one.sort(mySort).concat(two.sort(mySort)).concat(eq.sort(mySort))).sort((a,b) => a.length - b.length).join("/");
    // return {one, two, eq};
    return one.concat(two).concat(eq).sort(function(a,b){
        if(a.length > b.length) return -1;
        else if(a.length < b.length) return 1;
        else if(a.length === b.length) return 0;
    });
}   

console.log(mix("Are they here", "yes, they are here"));
console.log(mix("looping is fun but dangerous", "less dangerous than coding"));
console.log(mix('\'bcih1nzbaNgqjcAkogm/oxebTnmjq',',fmzkQsyftScukqKfefpEvxax0auvc'));