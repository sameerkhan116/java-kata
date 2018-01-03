var maxSequence = function(arr) {
    var ans = 0, min = 0, sum = 0;
    for(var i = 0; i < arr.length; i++) {
        sum += arr[i];
        min = Math.min(sum, min);
        ans = Math.max(ans, sum - min);
        console.log({sum, min, ans});
    }
    return ans;
}

console.log(maxSequence([-2, 1, -3, 4, -1, 2, 1, -5, 4]));