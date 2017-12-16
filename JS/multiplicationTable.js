function multiplicationTable(row,col){
    var main = [];
    var x = 0;
    for(var i = 0; i < row; i++) {
        var arr = [];
        for(var j = 0; j < col; j++) {
            x = (i+1) + j*(i+1);
            arr.push(x);
        }
        main.push(arr);
    }
    return main;
}

console.log(multiplicationTable(4,4));