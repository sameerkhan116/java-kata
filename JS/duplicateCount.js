function duplicateCount(text) {
    var tex = text.replace(/\d/g, '').split("").map(x => x.toLowerCase()).sort();
    tex = tex.filter((x, i) => tex.indexOf(x) != i);
    tex = tex.filter((x, i) => tex.indexOf(x) == i);
    return tex.length;
}

console.log(duplicateCount("abcde"));
console.log(duplicateCount("Indivisibilities"));
console.log(duplicateCount("aabbcde12345"));