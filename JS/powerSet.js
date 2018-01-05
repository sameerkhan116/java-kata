
function powerSet(s) {
    // after last element of array is traversed  
    if(s.length === 0) {
        return [[]];
    }
    
    // traverse elements from left to right -> get first element
    var head = s.splice(0,1)[0];
    var rem = powerSet(s);
    var powerSetWithHead = rem.map(function(p) {
        var cpy = p.slice();
        cpy.push(head);
        return cpy;
    });
    
    return (rem.concat(powerSetWithHead)).map(x => x.sort((a,b) => a - b));    
}

console.log(powerSet([1,2,3]))