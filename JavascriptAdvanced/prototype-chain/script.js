function Item() {};
Item.prototype.type = 'floral';
Item.prototype.log = function() {
  console.log('%c' + this.name, 'font-weight: bold;');
  for (let prop in this) {
    console.log(' ', prop, ': ' , this[prop]);
  }
};

function Live(name, pot, quantity = 1){
    this.name = name;
    this.pot = pot;
    this.quantity = quantity;
}
Live.prototype = new Item();
// Live.prototype.type = 'floral'; dopo aver creato il prototype di Item
Live.prototype.storage = 'room temperature';
// Live.prototype.logItem = function() {
//     console.log('%c' + this.name, 'font-weight: bold;');
//     for (let prop in this) {
//         console.log(' ', prop, ': ' , this[prop]);
//     }
// };

function Flower(quantity, color){
    this[color] = quantity;
}
Flower.prototype = new Live();
// Live.prototype.type = 'floral'; dopo aver creato il prototype di Item
// Flower.prototype.logItem = function() {
//     console.log('%c' + this.name, 'font-weight: bold;');
//     for (let prop in this) {
//         console.log(' ', prop, ': ' , this[prop]);
//     }
// };

function Cut() {};
Cut.prototype = new Item();
Cut.prototype.storage = 'cool';

function Arrangement(name , vase, quantity = 1){
    this.name = name;
    this.vase = vase;
    this.quantity = quantity;
}

Arrangement.prototype = new Cut();
// Arrangement.prototype.type = 'floral'; dopo aver creato il prototype di Item
//Arrangement.prototype.storage = 'cool';
// Arrangement.prototype.logItem = function() {
//     console.log('%c' + this.name, 'font-weight: bold;');
//     for (let prop in this) {
//         console.log(' ', prop, ': ' , this[prop]);
// }
// };

function Bouquet(name, vase){
    this.name = name;
    this.vase = vase;
}

Bouquet.prototype = new Cut();
// Bouquet.prototype.type = 'floral'; dopo aver creato il prototype di Item
// Bouquet.prototype.storage = 'cool';
// Bouquet.prototype.logItem = function() {
    //     console.log('%c' + this.name, 'font-weight: bold;');
    //     for (let prop in this) {
    //         console.log(' ', prop, ': ' , this[prop]);
    // }
    // };
Bouquet.prototype.flowers = {
    addStem: function(name, quantity = 1, color = 'Default'){
        this[name] = new Flower(quantity, color)
    }
};