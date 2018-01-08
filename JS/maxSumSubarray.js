var maxSumSub = function(arr){

    var powerset = function(arr) {
        if(arr.length == 0) return [[]];
        var head = arr.splice(0,1)[0];
        var tail = powerset(arr);
        var headWithTail = tail.map(p => {
            var cpy = p.slice();
            cpy.push(head);
            return cpy;
        });

        return tail.concat(headWithTail);
    }

    var arrSum = (y => y.length > 0 ? y.reduce((a,b) => a + b) : 0);

    var x = powerset(arr), largest = 0;
    for(var i = 0; i < x.length; i++) {
        if(largest < arrSum(x[i])) largest = arrSum(x[i]);
    }
    return largest;
};

console.log(maxSumSub([-11,2,3,4,5]))