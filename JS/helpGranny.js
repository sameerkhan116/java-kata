var helpGranny = function(friends, towns, distTable) {
    var dist = [];
    for(var i = 0; i < friends.length; i++) {
        for(var j = 0; j < towns.length; j++) {
            if(towns[j][0] == friends[i]) {
                var distToGet = towns[j][1];
                dist.push(distTable[distTable.indexOf(distToGet) + 1]);                
            }
        }
    }
    var temp = dist[dist.length - 1];
    var y = [];
    y.push(dist[0]);
    for(var i = 1; i < dist.length; i++) {
        y.push(distance(dist[i - 1], dist[i]));
    }
    y.push(temp);
    return parseInt(y.reduce((a, b) => a + b));
};

function distance(a, b) {
    var x = (b*b) - (a*a);
    return Math.sqrt(x);
}

var friends1 = ["A1", "A2", "A3", "A4", "A5"];
var fTowns1 = [["A1", "X1"], ["A2", "X2"], ["A3", "X3"], ["A4", "X4"]];
var distTable1 = ["X1", 100.0, "X2", 200.0, "X3", 250.0, "X4", 300.0];

console.log(helpGranny(friends1, fTowns1, distTable1));