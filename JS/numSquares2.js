/**
 * @param {number} n
 * @return {number}
 */
var numSquares = function(n) {
    // var j = 1, some = [];
    // while(j*j <= n){
    //     some.push(j*j);
    //     j++;
    // }

    // var minPerf = function(arr, n) {
    //     var ab = [], x = arr.length - 1;
    //     while(n > 0) {
    //         if(n - arr[x] >= 0) {
    //             n -= arr[x];
    //             ab.push(arr[x]);
    //         }
    //         else x--;
    //     }
    //     return ab;
    // }

    // var arr = [];
    // for(var i = 1; i <= some.length; i++) {
    //     arr.push(minPerf(some.slice(0,i), n));
    // }
    // console.log(arr);
    // var smallest = Number.MAX_SAFE_INTEGER;

    // for(var i = 0; i < arr.length; i++){
    //     if(arr[i].length < smallest) {
    //         smallest = arr[i].length;
    //     }
    // }
    // return smallest;

    var arr = new Array(n + 1);
    arr.fill(Number.MAX_SAFE_INTEGER);
    arr[0] = 0;
    for(var i = 0; i <= n; i++){
        for(var j = 1; j * j <= i; j++){
            arr[i] = Math.min(arr[i], arr[i - j * j] + 1);
            // console.log(arr[i] + "\n" + arr[i - j * j] + 1); 
        }
    }
    return arr[n];
};

console.log(numSquares(13));
console.log(numSquares(12));
console.log(numSquares(43));

