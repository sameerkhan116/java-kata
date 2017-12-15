function to_nato(words) {
    var dictionary = { a: "Alfa", b: "Bravo", c: "Charlie", d: "Delta", e: "Echo", f: "Foxtrot", g: "Golf", h: "Hotel", i: "India", j: "Juliett", k: "Kilo", l: "Lima", m: "Mike", n: "November", o: "Oscar", p: "Papa", q: "Quebec", r: "Romeo", s: "Sierra", t: "Tango", u: "Uniform", v: "Victor", w: "Whiskey", x: "Xray", y: "Yankee", z: "Zulu" }
    return words.replace(/\s/gi, '').split('').map(x => dictionary[x.toLowerCase()] || x).join(' ');
}

console.log(to_nato('If you can read'));
console.log(to_nato('go for it!'));
