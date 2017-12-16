function zero(func) {
    return func ? func(0) : 0;
}
function one(func) { 
    return func ? func(0) : 0; 
}
function two(func) { 
    return func ? func(0) : 0; 
}
function three(func) { 
    return func ? func(0) : 0;
}
function four(func) { 
    return func ? func(0) : 0;
}
function five(func) {
    return func ? func(0) : 0; 
}
function six(func) { 
    return func ? func(0) : 0; 
}
function seven(func) { 
    return func ? func(0) : 0;
}
function eight(func) { 
    return func ? func(0) : 0; 
}
function nine(func) { 
    return func ? func(0) : 0; 
}

function plus(a) {
    return function(b) {
        return b + a;
    }
}
function minus(a) {
    return function(b) {
        return b - a;
    }
}

function times(a) {
    return function(b) {
        return b * a;
    }
}
function dividedBy(a) {
    return function(b) {
        return b / a;
    }
}

console.log(seven(times(five())));
console.log(four(plus(nine())));
console.log(eight(minus(three())));
console.log(six(dividedBy(two())));