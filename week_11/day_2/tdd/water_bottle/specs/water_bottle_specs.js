var assert = require("assert");
var WaterBottle = require("../water_bottle.js");

describe("Water Bottle", function(){
  it("should be empty at start", function(){
    var bottle = new WaterBottle();
    assert.strictEqual(bottle.volume, 0);
  });

  it("should go to 100 when filled", function(){
    var bottle = new WaterBottle();
    bottle.fill();
    assert.strictEqual(bottle.volume, 100);
  })

  it("should go down by 10 when drank", function(){

  });
});
