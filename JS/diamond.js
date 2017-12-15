function diamond(n) {

    if(n <= 2 || n % 2 === 0) {
        return null;
    }

    var x = "";
    var i = n, j = 0, a = 1, k = n/2;

    while(a < n) {
        x += " ".repeat(k) + "*".repeat(a) + "\n";
        a += 2;
        k--;
    }

    while(i > 0) {
        x += " ".repeat(j) + "*".repeat(i) + "\n";
        i -= 2;
        j++;
    }
    return x;
}

console.log(diamond(7));