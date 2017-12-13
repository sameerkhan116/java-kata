function removeSmallest(numbers) {
    var smallest = Math.min(...numbers);

    numbers.splice(numbers.indexOf(smallest),1);
    return numbers;
}

console.log(removeSmallest([5, 3, 2, 1, 4]));