function arithmeticSequenceElements(a,r,n) {
    var x = "";
    for(var i = 0; i < n - 1; i ++) {
        x += a + ", ";
        a += r;
    }
    return x + a;
}

console.log(arithmeticSequenceElements(1,2,5));