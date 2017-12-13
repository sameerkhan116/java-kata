function tickets(peopleInLine){
    // console.log(peopleInLine);

    var start = [parseInt(peopleInLine[0])];
    for(var i = 1; i < peopleInLine.length; i++) {
        
        if(peopleInLine[i] === 50) {
            if(start[0] != 25) {
                return "NO";
            }
            else {
                start.splice(0,1);
                start.push(parseInt(peopleInLine[i]));
            }
        }
        else if(peopleInLine[i] === 100) {
            if(start[0] != 25) {
                return "NO";
            }
            else if(!(start.indexOf(50) === -1) && ((start[start.indexOf(50) -  1] + 50) === 75)) {
                start.splice((start.indexOf(50) - 1), 2);
                start.push(parseInt(peopleInLine[i]));
            }
            else if(start[0] + start[1] + start[2] === 75) {
                start.splice(0,3);
                start.push(parseInt(peopleInLine[i]));
            }
            else {
                return "NO";
            }
        }
        else {
            start.push(25);
        }

        start.sort((a,b) => a - b);
    }

    return "YES";


    console.log(start);
}

// console.log(tickets([25,50,25,100,25,25,50,100,25,50,25,100,25,50,25,100,25,50,50,25]));
console.log(tickets([25,25,25,100,25,25,25,100,25,25,50,100,25,50,25,100]));
// console.log(tickets([ 25, 25, 25, 25, 50, 100, 50 ]));