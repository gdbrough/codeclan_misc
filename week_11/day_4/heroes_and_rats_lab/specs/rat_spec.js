var assert = require('assert');
var Food = require('../food.js');
var Rat = require('../rat.js');

describe("Rat", function(){

  var food1;
  var rat1;

  beforeEach(function(){
    food1 = new Food("cheese", 5, false);
    rat1 = new Rat();
  });

  xit("should be able to touch food", function(){
    assert.strictEqual(food1.isPoisonous, false);
    rat1.touchFood(food1)
    assert.strictEqual(food1.isPoisonous, true);
  });

});
