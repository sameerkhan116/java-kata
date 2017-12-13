function isValidWalk(walk) {
    var x = 0;
    for(i in walk) {
        if(walk[i] == 'n') {
            x += 1;
        }
        if(walk[i] == 's') {
            x -= 1;
        }
        if(walk[i] == 'w') {
            x += 2;
        }
        if(walk[i] == 'e') {
            x -= 2;
        }
    }
    return (walk.length === 10) && x === 0;
}      

// isValidWalk(['n','s','n','s','n','s','n','s','n','s']);
console.log(isValidWalk(['n','s','n','s','n','s','n','s','n','s']));