var mergeSort = function(arr1, arr2) {
    var i = arr1.length - 1;
    var j = arr2.length - 1;
    var k = arr1.length + arr2.length - 1;
    while(i >= 0 && j >= 0) {
        if(arr1[i] > arr2[j]) arr1[k--] = arr1[i--];
        else arr1[k--] = arr2[j--];
    }
    while(j >= 0) arr1[k--] = arr2[j--];
    return arr1;
};

console.log(mergeSort([1,3,5,7,9],[2,4,6,8,10]))