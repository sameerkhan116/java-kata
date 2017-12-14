function squareDigits(num){
    // var x = "";
    // num = num.toString();
    // for(var i = 0; i < num.length; i++) {
    //     x += Math.pow(parseInt(num.charAt(i)),2);
    // }
    // return parseInt(x);
    return parseInt(num.toString().split('')
        .map((val) => val * val).join(''));
}


console.log(typeof(squareDigits(9119)));