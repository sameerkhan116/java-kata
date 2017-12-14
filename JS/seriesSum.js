function SeriesSum(num){
    for(var x = 0, i = 0; i < num; i++) {
        x += 1/(1 + i*3);
    }
    return x.toFixed(2);
}

console.log(SeriesSum(5));