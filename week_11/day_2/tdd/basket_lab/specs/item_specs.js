var assert = require("assert");
var Item = require("../item.js");

describe("Item", function(){
  it("can create new item", function(){
    var item = new Item("Item1", 1.99, false);
    assert.strictEqual(item.name, "Item1");
    assert.strictEqual(item.price, 1.99);
    assert.strictEqual(item.bogof, false);
  });
});
