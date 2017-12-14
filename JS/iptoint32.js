function ipToInt32(ip){
    return parseInt(ip.split('.').map(x => ('00000000' + (x >>> 0).toString(2)).slice(-8)).join(''),2);
}

console.log(ipToInt32("128.32.10.1"));