function code(s) {
    if(s == null || s.length == 0) return s;
    let n = parseInt(Math.sqrt(s.length)), x = [];
    if((n*n) < s.length) {
        n += 1;
        while(s.length < n*n) s += String.fromCharCode(11);
    }
    s = s.match(new RegExp('.{1,' + n + '}', 'g'));
    let newString = rot90Clock(s);
    // x = rot90Clock(x);
    // return x.join("\n");
    return newString.join("\n");
}

function rot90Clock(arr) {
    let diag = [];
    for(var i = 0; i < arr.length; i++) {
        let thisOne = '';
        for(const x of arr) thisOne += x.charAt(i);
        diag.push(thisOne);
    }
    return diag.map(x => x.split("").reverse().join(""));
}

function decode(s) {
    if(s == null || s.length == 0) return s;    
    var n = parseInt(Math.sqrt(s.length));
    s = s.match(new RegExp('.{1,' + n + '}', 'g'));
    let newString = rot90Counter(s);
    return newString.join("").trim();
}

function rot90Counter(arr) {
    let diag = [];
    for(var i = 0; i < arr.length; i++) {
        let x = '';
        for(const a of arr) x += a.charAt(i);
        diag.unshift(x.split("").reverse().join(""));
    }
    return diag.map(x => x.split("").reverse().join(""));
}

var data1 = "What do you remember? When I looked at his streaky glasses, I wanted " +
"to leave him. And before that? He stole those cherries for me at midnight. We were walking " +
"in the rain and I loved him. And before that? I saw him coming " +
"toward me that time at the picnic, edgy, foreign."

console.log(code(data1));
console.log(decode("\vctg?.nadr d gdbW\n\v,i    lnis tl eh\n\v mtIAakietboaara\n\veeo nnigsoe st?t\n\vd wsddnh lfls   \n\vgaaa  gtfeoeehWd\n" +
"\vytrwbI .o rasiho\n\v, d e i rtev,se \n\v t hflnW h e  ny\n\vfhmioo emot Is o\n\voeemrvt eshh tIu\n\vr   eehw eaiwr  \n" +
"\veptc deea tmaelr\n\viihot  rtc?.naoe\n\vgcamhhre h  tkom\n\vnntiaia meHAeyke\n\v.i ntmiwirend em"));