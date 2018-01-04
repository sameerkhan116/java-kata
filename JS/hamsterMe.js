function hamsterMe(code, message) {
    var mSorted = [...code].filter((x,i) => code.indexOf(x) == i).sort().map(x => x.charCodeAt());
    var dict = {};
    'abcdefghijklmnopqrstuvwxyz'.split("").map(x => dict[x] = []);
    var finalVal = "";
    var fin = [];
    for(var i = 0; i < mSorted.length; i++) {
        var x = 0;
        a = mSorted[i];
        while(a < mSorted[i+1]) {
            dict[String.fromCharCode(mSorted[i])].push(a);
            a++;
        }
    }

    if(dict[String.fromCharCode(mSorted[0])][0] > 97) {
        var x = mSorted[mSorted.length - 1];
        while(x != dict[String.fromCharCode(mSorted[0])][0]) {
            x = x >= 123 ? (x % 123) + 97 : x;
            dict[String.fromCharCode(mSorted[mSorted.length - 1])].push(x);
            x++;
        }
    } else {
        var x = mSorted[mSorted.length - 1];
        while(x < 123) {
            dict[String.fromCharCode(mSorted[mSorted.length - 1])].push(x);
            x++;
        }
    }

    for(key in dict) {
        if(dict[key].length == 0) {
            delete dict[key];
        } else {
            dict[key] = dict[key].map(x => String.fromCharCode(x));
            dict[key] = dict[key].map((x, i) => key + "" + (i + 1));
            fin.push(...dict[key]);
        }
    }
    fin = fin.sort();

    for(var i = 0; i < message.length; i++){
        finalVal += fin[message[i].charCodeAt() - 97];
    }
    return finalVal;
}

console.log(hamsterMe("hamster", "hamster"));
console.log(hamsterMe("hamster", "helpme"));