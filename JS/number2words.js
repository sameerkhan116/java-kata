function number2words(n) {
    var dict = {0: "zero", 1: "one", 2: "two", 3: "three", 4: "four", 5: "five", 6: "six", 7: "seven", 8: "eight", 9: "nine", 10: "ten", 11: "eleven", 12: "twelve",
                13: "thirteen", 14: "fourteen", 15: "fifteen", 16: "sixteen", 17: "seventeen", 18: "eighteen", 19: "nineteen"};
    
    var str = "";

    var twenty = function(n) {
        var ts = dict[2].substring(0, dict[2].length - 1) + "enty";
        var os = dict[n - 20];
        return os == "zero" ? ts : ts + "-" + os;
    }
    var thirty = function(n) {
        var ts = "thirty";
        var os = dict[n - 30];
        return os == "zero" ? ts : ts + "-" + os;
    }
    var forty = function(n) {
        var ts = "forty";
        var os = dict[n - 40];
        return os == "zero" ? ts : ts + "-" + os;
    }
    var fifty = function(n) {
        var ts = "fifty";
        var os = dict[n - 50];
        return os == "zero" ? ts : ts + "-" + os;
    }
    var tens = function(n) {
        var str = Math.floor(n/10);
        var ts = str == 8 ? dict[str].substring(0, dict[str].length - 1) + "ty" : dict[str] + "ty";
        var os = dict[n - (Math.floor(n/10) * 10)];
        return os == "zero" ? ts : ts + "-" + os;
    }
    var hundreds = function(n) {
        if(n >= 100) {
            var hs = dict[Math.floor(n / 100)];
            var ts = Math.floor(n - Math.floor(n / 100) * 100);
        }
        return hs + " hundred" + (ts == 0 ? "" : " " + main(ts));
    }


    var main = function(n) {
        if(n < 20) {
            return dict[n];
        }
        else if(n >= 20 && n < 30) {
            return twenty(n);
        }
        else if(n >= 30 && n < 40) {
            return thirty(n);
        }
        else if(n >= 40 && n < 50) {
            return forty(n);
        }
        else if(n >= 50 && n < 60) {
            return fifty(n);
        }
        else if(n >= 60 && n < 100) {
            return tens(n);
        }
    }

    if(n < 100) {
        return main(n);
    }
    else if(n >= 100 && n < 1000) {
        return hundreds(n);
    }
    else if(n >= 1000 && n <= 999999) {
        let x = n.toString();
        if(x.length == 4) {
            n1 = parseInt(x.substring(0,1));
            n2 = parseInt(x.substring(1));
            return main(n1) + " thousand" + (n2 == 0 ? "" : (n2 < 100 ? " " + main(n2) : " " + hundreds(n2)));
        }
        else if(x.length == 5) {
            n1 = parseInt(x.substring(0,2));
            n2 = parseInt(x.substring(2));
            return main(n1) + " thousand " + (n2 == 0 ? "" : (n2 < 100 ? " " + main(n2) : " " + hundreds(n2)));         
        }
        else if(x.length == 6) {
            n1 = parseInt(x.substring(0,3));
            n2 = parseInt(x.substring(3));
            return hundreds(n1) + " thousand " + (n2 == 0 ? "" : (n2 < 100 ? " " + main(n2) : " " + hundreds(n2)));
            
        }
    }
}

// console.log(number2words(19));
// console.log(number2words(888));
// console.log(number2words(0));
// console.log(number2words(1));
// console.log(number2words(9));
// console.log(number2words(10));
// console.log(number2words(17));
// console.log(number2words(20));
// console.log(number2words(21));
// console.log(number2words(45));
// console.log(number2words(80));
// console.log(number2words(99));
// console.log(number2words(100));
// console.log(number2words(301));
// console.log(number2words(799));
// console.log(number2words(800));
// console.log(number2words(950));
console.log(number2words(1000));
console.log(number2words(1002));
console.log(number2words(3051));
console.log(number2words(7200));
console.log(number2words(7219));
console.log(number2words(8330));
console.log(number2words(99999));
console.log(number2words(888888));





