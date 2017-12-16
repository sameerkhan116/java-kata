function chooseBestSum(t, k, ls) {
    function combinations(ls, k) {
      return k == 0 ? [[]] : ls.map(function (e, i) {
        return combinations(ls.slice(i+1), k-1).map(function (c) {
          return [e].concat(c);
        });
      }).reduce(function (a, b) {
        return a.concat(b);
      }, []);
    }
    var distances = combinations(ls, k).map(c => c.reduce((e, a) => e + a));
    return distances.filter(e => e <= t).sort((a, b) => b - a)[0] || null;
}

ts = [91, 74, 73, 85, 73, 81, 87]
console.log(chooseBestSum(230, 3, ts))