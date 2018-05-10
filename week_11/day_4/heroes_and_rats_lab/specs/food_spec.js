var assert = require('assert');
var Food = require('../food.js');

describe("Food", function(){

  var food1;

  beforeEach(function(){
    food1 = new Food("cheese", 5, false);
    food2 = new Food("steak", 30, false);
  });

  it("should have a name", function(){
    assert.strictEqual(food1.name, "cheese");
  });

  it("should have a replenishment value", function(){
    assert.strictEqual(food2.value, 30);
  });

});





// Food should have a name
// Food should have a replenishment value
