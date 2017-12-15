function thirt(n) {
    var seq = [1, 10, 9, 12, 3, 4];

    var result = function res(n) {
        var i = 0, x = 0;
        var sum = 0;
        var num = n.toString().split('').reverse();
        while(i < num.length) {
            sum += seq[x] * num[i];
            i++;
            x++;
            if(x === seq.length) {
                x = 0;
            }
        }
        return sum;
    }

    var x = result(n);

    while(true) {
        if(result(x) / 100 < 1) {
            return result(x);
        }
        x = result(x);
    }
}

console.log(thirt(85299258));