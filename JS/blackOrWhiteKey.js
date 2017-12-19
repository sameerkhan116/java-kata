function blackOrWhiteKey(keyPressCount) {
    var arr = ['black', 'white', 'black', 'white', 'white', 'black', 'white', 'black', 'white', 'black', 'white', 'white'];
    // if(keyPressCount % 88 == 87 || keyPressCount % 88 === 0) return 'white';
    // else if(keyPressCount % 88 >= 1 && keyPressCount % 88 < 5) {
    //     if(keyPressCount % 88 === 2) return 'black';
    //     else return 'white';
    // }
    // else {
    //     return arr[((keyPressCount % 88) - 5) % 12];
    // }

    return keyPressCount % 88 === 87 || keyPressCount % 88 === 0 ? 'white' : ( keyPressCount % 88 >= 1 && keyPressCount % 88 < 5 ? ( keyPressCount % 88 === 2 ? 'black' : 'white' ) : arr[((keyPressCount % 88) - 5) % 12] );
}

console.log(blackOrWhiteKey(1));
console.log(blackOrWhiteKey(5));
console.log(blackOrWhiteKey(200));
console.log(blackOrWhiteKey(88));
console.log(blackOrWhiteKey(42));