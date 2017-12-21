var sum_pairs = function(int,s){
    var seen = {};
    for(var i = 0; i < int.length; i++) {
        if(seen[s - int[i]]) return [s-int[i], int[i]];
        seen[int[i]] = true;
    }
}

l1= [1, 4, 8, 7, 3, 15];
l2= [1, -2, 3, 0, -6, 1];
l3= [20, -13, 40];
l4= [1, 2, 3, 4, 1, 0];
l5= [10, 5, 2, 3, 7, 5];
l6= [4, -2, 3, 3, 4];
l7= [0, 2, 0];
l8= [5, 9, 13, -3];
console.log(sum_pairs(l5, 10));
console.log(sum_pairs(l1, 8));
console.log(sum_pairs(l8, 10));