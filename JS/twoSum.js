function twoSum(numbers, target) {
    console.log(numbers, target);
    var arr = [];
    for(var i = 0; i < numbers.length; i++) {
        second = numbers.indexOf(target - numbers[i], i + 1);
        if(second > i) return [i, second];
        // for(j = i + 1; j < numbers.length; j++) {
        //     if(numbers[i] + numbers[j] === target) arr = [i, j];
        // }
    }
    return arr.sort();
}

console.log(twoSum([1234,5678,9012], 14690));
console.log(twoSum([5678,9012,1234], 14690));
