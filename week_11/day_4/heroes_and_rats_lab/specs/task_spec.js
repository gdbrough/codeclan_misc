var assert = require('assert');
var Task = require('../task.js');

describe("Task", function(){

  var task1;

  beforeEach(function(){
    task1 = new Task("task1", 5, 10, 1000, false);
  });

  it("should have a name", function(){
    assert.strictEqual(task1.name, "task1");
  })

  it("should have a difficulty level", function(){
    assert.strictEqual(task1.difficulty, 5);
  });

  it("should have an urgency level", function(){
    assert.strictEqual(task1.urgency, 10);
  });

  it("should have a reward", function(){
    assert.strictEqual(task1.reward, 1000);
  });

  it("should be able to mark as complete", function(){
    assert.strictEqual(task1.isComplete, false);
    task1.setTaskAsComplete();
    assert.strictEqual(task1.isComplete, true);
  });

});






// A task has a difficulty level
// A task has an urgency level
// A task has a reward
// A task should be able to be marked as completed
