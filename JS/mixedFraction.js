function mixedFraction(s){
    function gcd(a, b){
        if (b === 0) return a;
        return gcd(b, a%b);
    }
    var str = "";
    x = s.split("/");
    var sign = "-";
    if(x[0].charAt(0) == "-" && x[1].charAt(0) == "-") sign = "";
    else if(x[0].charAt(0) == "-" || x[1].charAt(0) == "-") sign = "-";
    else sign = "";

    x = x.map(a => a < 0 ? a*-1: a);
    let f = gcd(x[0],x[1]);

    if(f != 1) {
        x[0] = x[0]/f;
        x[1] = x[1]/f;
    }

    a = x.reduce((a,b) => Math.floor(a/b));
    b = x[0] - (x[1] * a);

    // if(gcd(b,x[1]) != 1) {
    //     x[1] = x[1]/gcd(b,x[1]);
    //     b = b/gcd(b,x[1]);
    // }

    if(b === 0) {
        str = sign + a;
    }
    else if(a === 0) {
        str = sign + b + "/" + x[1];
    }
    else str = sign + a + " " + b + "/" + x[1];
    return str == -0 ? '0' : str;
}

console.log(mixedFraction("4/6"));
console.log(mixedFraction("-10/7"));
console.log(mixedFraction("-22/-7"));
