function Fighter(name, health, damagePerAttack) {
    this.name = name;
    this.health = health;
    this.damagePerAttack = damagePerAttack;
    this.toString = (() => this.name);
}


// fighter1 = new Fighter("Lew", 10, 2); 
// fighter2 = new Fighter("Harry", 5, 4);

function declareWinner(fighter1, fighter2, firstAttacker) {
    // console.log(fighter1, fighter2, firstAttacker);
    
//     var x = fighter1.health;
//     var y = fighter2.health;
   
//     if(fighter1.toString() === firstAttacker) {
//         y -= fighter1.damagePerAttack;
//         if(y <= 0) return fighter1.toString();
//         while(x > 0 || y > 0) {
//             x -= fighter2.damagePerAttack;
//             y -= fighter1.damagePerAttack;
//             if(x <= 0) {
//                 return fighter2.toString();
//             }
//             else if(y <= 0) {
//                 return fighter1.toString();
//             } 
//         }
//     }
//     else {
//         x -= fighter2.damagePerAttack;  
//         if(x <= 0) return fighter2.toString();        
//         while(x > 0 || y > 0) {
//             y -= fighter1.damagePerAttack;
//             x -= fighter2.damagePerAttack;
//             if(x <= 0) {
//                 return fighter2.toString();
//             }
//             else if(y <= 0) {
//                 return fighter1.toString();
//             } 
//         }       
//     }
// return "";
    var x = Math.ceil(fighter1.health / fighter2.damagePerAttack);
    var y = Math.ceil(fighter2.health / fighter1.damagePerAttack);
    return x == y ? firstAttacker : ((x < y) ? fighter2.toString() : fighter1.toString());
    
}

console.log(declareWinner(new Fighter("Lew", 10, 2), new Fighter("Harry", 5, 4), "Harry"));
console.log(declareWinner(new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4), "Harald"));
console.log(declareWinner(new Fighter("Michael", 833, 28), new Fighter("Rocky", 59, 82), "Rocky"));

