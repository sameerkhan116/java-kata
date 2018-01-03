function evaporator(content, evap_per_day, threshold){ 
    var t = content * threshold / 100, count = 0;
    while(content > t) {
        content -= (content * evap_per_day) / 100; count++;
    }
    return count;
}

console.log(evaporator(10,10,10));