const binaryArrayToNumber = arr => {
    // var result = 0;
    // var x = arr.length - 1;
    // for(var i = 0; i < arr.length; i++) {
    //     if(arr[i] === 1) {
    //         result += Math.pow(2, x);
    //     }
    //     x--;
    // }
    // return result;
    parseInt(arr.join(''), 2);
};

console.log(binaryArrayToNumber([1,1,1,1]));