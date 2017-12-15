function breakCamel(str) {
    return str.split(/(?=[A-Z])/g).join(' ');
}

console.log(breakCamel('camelCasing isAwesome'));