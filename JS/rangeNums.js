// Should return a string representing the ranges
function toRange(arr) {
    arr = Array.from(new Set(arr)).sort((a,b) => a - b);
    for(var i = 0, r = []; i < arr.length;) {
        var s = i;
        while(i < arr.length && arr[i + 1] == arr[i] + 1) i++;
        r.push(i == s ? arr[i++] : arr[s] + "_" + arr[i++]);
    }
    return r.join(",");
}

// Should return an array
function toArray(str) {
    var r = [];
    if(str != "") {
        var arr = str.split(',');
        for(var i = 0; i < arr.length; i++) {
            if(arr[i].indexOf('_') != -1) {
                var x = arr[i].split('_');
                console.log(x[0] + " " + x[1]);
                for(var j = parseInt(x[0]); j <= parseInt(x[1]); j++) {
                    r.push(j);
                }
            }
            else r.push(parseInt(arr[i]));
        }
    }
    return r;
    // return r.map(x => typeof x == 'string' ? parseInt(x) : x);
}

console.log(toRange([3,4,5,6,9]));
console.log(toArray("3_6,9"));
console.log(toArray("5_6,8_9"));
console.log(toArray('0_8,10_15,17_21,23,25_26,28_54,56_61,63_64,66_68,70_97,99'));
console.log(toArray('0_5,7,9_16,18_25,27_35,37_56,58_72,74_81,83_88,90_97,99'));
