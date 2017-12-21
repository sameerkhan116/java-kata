function iqTest(numbers) {
    numbers = numbers.split(" ");
    return numbers.filter(x => x % 2).length == 1 ? numbers.indexOf(numbers.filter(x => x % 2)[0]) + 1 : numbers.indexOf(numbers.filter(x => !(x % 2))[0]) + 1;
}

console.log(iqTest("2 4 7 8 10"));
console.log(iqTest("1 2 2"));