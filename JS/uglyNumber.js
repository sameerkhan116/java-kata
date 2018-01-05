/**
 * @param {number} num
 * @return {boolean}
 */
var isUgly = function(num) {

    if(num === 1) return true;
    if(num < 2) return false;

    var p = [];
    while(num % 2 == 0) {
        p.push(2);
        num /= 2;
    }
    for(var i = 3; i <= Math.sqrt(num); i += 2) {
        while(num % i == 0) {
            p.push(i);
            num /= i;
        }
    }
    if(num > 2) p.push(num);
    
    p = p.filter(x => x != 2 && x != 3 && x != 5);
    return p.length > 0 ? false : true;
};

console.log(isUgly(14));
console.log(isUgly(6));
console.log(isUgly(8));
