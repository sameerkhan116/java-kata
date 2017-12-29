function bestMatch(ALAHLYGoals, zamalekGoals) {
    var x = ALAHLYGoals.map((x,i) => ALAHLYGoals[i] - zamalekGoals[i]);
    var smallest = Number.MAX_SAFE_INTEGER;
    var p = [];
    for(var i = 0; i < x.length; i++) {
        if(x[i] < smallest) smallest = x[i];
    }
    for(var i = 0; i < x.length; i++) {
        if(x[i] == smallest) p.push(i);
    }
    var largest = 0;
    var fin = 0;
    for(var i = 0; i < p.length; i++) {
        if(largest < zamalekGoals[p[i]]) {
            largest = zamalekGoals[p[i]];
            fin = p[i];
        }
    }
    return fin;
}

console.log(bestMatch([4, 3, 4],[1, 1, 1]));
console.log(bestMatch([3, 4, 3],[1, 1, 2]));
console.log(bestMatch([1, 2, 3, 4, 5],[0, 1, 2, 3, 4]));
console.log(bestMatch([1],[0]));
console.log(bestMatch([6, 4],[1, 2]));
console.log(bestMatch([9,9,8,6,2,8,9],[0,3,3,1,1,5,3]));
console.log(bestMatch([15,8,13,12,5,7,14,8,16,7,11,4,13,11,15,10],[8,0,3,10,2,6,7,7,8,0,8,3,7,8,7,4]));
 