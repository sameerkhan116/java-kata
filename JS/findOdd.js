function findOdd(A) {
    //happy coding!
    var dictionary = {};
    A.filter((x,i) => A.indexOf(x) == i).map(x => dictionary[x] = 0);
    A.map(x => dictionary[x] += 1);
    for(key in dictionary){
        if(dictionary[key] % 2 != 0) {
            return parseInt(key);
        }
    }
}

  console.log(findOdd([1,1,2,-2,5,2,4,4,-1,-2,5]));