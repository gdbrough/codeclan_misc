var Basket = function(discountCard){
  this.discountCard = discountCard;
  this.items = [];
};

Basket.prototype.newItem = function(addedItem) {
  this.items.push(addedItem);
};

Basket.prototype.removeItem = function (itemToBeRemoved) {
  var pos = this.items.indexOf(itemToBeRemoved);
  this.items.splice(pos, 1);
};

Basket.prototype.apply10pcDiscount = function(basketCost) {
  var discount = (basketCost * 0.1);
  return Math.round((basketCost - discount)*100)/100;
};

Basket.prototype.apply5pcDiscount = function (basketCost) {
  var discount = (basketCost * 0.05);
  return Math.round((basketCost - discount)*100)/100;
};

Basket.prototype.totalBasketCost = function () {
  let totalCost = 0;
  for (item of this.items){
    totalCost += item.price;
  };
  if (totalCost > 20){
    totalCost = this.apply10pcDiscount(totalCost);
  }
  if (this.discountCard){
    totalCost = this.apply5pcDiscount(totalCost);
  }
  return totalCost;
};

module.exports = Basket;
