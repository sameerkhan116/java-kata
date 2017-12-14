function findNb(n) {
    var i = 0;
    var x = 0;

    while(x < n) {
        i++;
        x += Math.pow(i, 3);
    }
    return x === n ? i : -1;
}

console.log(findNb(424723578342962));
console.log(findNb(4183059834009));