function queueTime(customers, n) {
    var arr = Array.apply(null, Array(n))
        .map(val => 0);
    for(var i = 0; i < customers.length; i++){
        var min = Math.min(...arr);
        arr[arr.indexOf(min)] += customers[i];
    }
    return Math.max(...arr);
}

console.log(queueTime([1,2,3,4], 1));