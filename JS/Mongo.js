var Mongo = {
    
    'isValid' : function(s) {
        if(typeof s == 'string') {
            s = s.split("").filter(x => x == x.toLowerCase() && x.match(/[a-f0-9]/g)).join("");
            return s.length == 24 ? true : false;
        }
        return false;
    },

    'getTimestamp' : function(s){
        if(Mongo.isValid(s)) {
            return new Date(parseInt(s.substring(0,8), 16) * 1000);
        }
        return false;
    }
}

console.log(Mongo.isValid(111111111111111111111111));
console.log(Mongo.isValid('111111111111111111111111'));
console.log(Mongo.isValid('507f1f77bcf86cD799439011'));
console.log(Mongo.getTimestamp('111111111111111111111111'));
console.log(Mongo.getTimestamp(111111111111111111111111));
console.log(Mongo.getTimestamp('507f1f77bcf86cd799439011'));