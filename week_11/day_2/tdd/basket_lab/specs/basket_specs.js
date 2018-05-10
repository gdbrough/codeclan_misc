var assert = require("assert");
var Basket = require("../basket.js");
var Item = require("../item.js")

describe("Basket", function(){

  beforeEach(function () {
      basket = new Basket();
      emptyBasket = new Basket(false);
  });

  it("should be empty at start", function(){
    assert.strictEqual(emptyBasket.items.length, 0);
  });

  it("can add single item to basket", function(){
    item1 = new Item("testItem1", 4.99, false);
    basket.newItem(item1);
    assert.strictEqual(basket.items.length, 1);
  });

  it("can add multiple items to basket", function(){
    item1 = new Item("testItem1", 4.99, false);
    basket.newItem(item1);
    item2 = new Item("testItem2", 5.99, false);
    basket.newItem(item2);
    item3 = new Item("testItem3", 6.99, false);
    basket.newItem(item3);
    assert.strictEqual(basket.items.length, 3);
  });

  it("can remove specific item", function(){
    item1 = new Item("testItem1", 4.99, false);
    basket.newItem(item1);
    item2 = new Item("testItem2", 5.99, false);
    basket.newItem(item2);
    item3 = new Item("testItem3", 6.99, false);
    basket.newItem(item3);
    basket.removeItem(item2);
    assert.strictEqual(basket.items.length, 2);
    // assert.notEqual(-1, basket.items.indexOf(item1));
    // assert.notEqual(-1, basket.items.indexOf(item3));
    // assert.strictEqual(-1, basket.items.indexOf(item2));
    assert.deepStrictEqual(basket.items, [item1, item3]) // better way to do it
  });

  it("can get total basket cost", function(){
    item1 = new Item("testItem1", 4.99, false);
    basket.newItem(item1);
    item2 = new Item("testItem2", 5.99, false);
    basket.newItem(item2);
    item3 = new Item("testItem3", 6.99, false);
    basket.newItem(item3);
    assert.strictEqual(basket.totalBasketCost(), 17.97);
  });

  it("can apply 10% discount", function(){
    assert.strictEqual(basket.apply10pcDiscount(20.00), 18.00);
  });

  it("can apply discount to all shopping baskets over £20", function(){
    item1 = new Item("testItem1", 4.99, false);
    basket.newItem(item1);
    item2 = new Item("testItem2", 5.99, false);
    basket.newItem(item2);
    item3 = new Item("testItem3", 6.99, false);
    basket.newItem(item3);
    item4 = new Item("testItem4", 6.99, false);
    basket.newItem(item4);
    assert.strictEqual(basket.totalBasketCost(), 22.46);
  })

  it("can apply additional 5% when discount card applies", function(){
    basketDisc = new Basket(true);
    basket2Disc = new Basket(true);
    item1 = new Item("testItem1", 4.99, false);
    basketDisc.newItem(item1);
    item2 = new Item("testItem2", 5.99, false);
    basketDisc.newItem(item2);
    item3 = new Item("testItem3", 6.99, false);
    basketDisc.newItem(item3);
    item4 = new Item("testItem4", 6.99, false);
    basketDisc.newItem(item4);
    assert.strictEqual(basketDisc.totalBasketCost(), 21.34);
    item1 = new Item("testItem1", 4.99, false);
    basket2Disc.newItem(item1);
    item2 = new Item("testItem2", 5.99, false);
    basket2Disc.newItem(item2);
    item3 = new Item("testItem3", 6.99, false);
    basket2Disc.newItem(item3);
    assert.strictEqual(basket2Disc.totalBasketCost(), 17.07);
  });

});
