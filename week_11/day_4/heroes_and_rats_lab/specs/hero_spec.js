var assert = require("assert");
var Hero = require("../hero.js");
var Food = require("../food.js")
var Task = require("../task.js")

describe("Hero", function(){

  var hero1;
  var food1;
  var food2;
  var task1;
  var task2;
  var task3;
  var task4;

  beforeEach(function(){
    hero1 = new Hero("Hero1", 100, "steak");
    food1 = new Food("cheese", 5, false);
    food2 = new Food("steak", 30, false);
    task1 = new Task("task1", 10, 40, 3000, true);
    task2 = new Task("task2", 20, 10, 4000, false);
    task3 = new Task("task3", 30, 20, 1000, false);
    task4 = new Task("task4", 40, 30, 2000, true);
    hero1.addTask(task1);
    hero1.addTask(task2);
    hero1.addTask(task3);
    hero1.addTask(task4);
  });

// hero
  it("should have a name", function(){
    assert.strictEqual(hero1.name, "Hero1");
  });

  it("should have health", function(){
    assert.strictEqual(hero1.health, 100);
  });

  it("should have favourite food", function(){
    assert.strictEqual(hero1.favouriteFood, "steak");
  })

  it("should be able to say their name", function(){
    assert.strictEqual(hero1.talk(hero1.name), "Hello, my name is Hero1.")
  })

// food
  it("should be able to eat food and health should increase by food value", function(){
    assert.strictEqual(hero1.eat(food1), "Nom nom nom, nice cheese.");
    assert.strictEqual(hero1.health, 105);
  });

  it("should increase health by additional 50% if favourite food", function(){
    assert.strictEqual(hero1.eat(food2), "Nom nom nom, very nice steak.");
    assert.strictEqual(hero1.health, 145);
  });

// tasks
  it("should be able to add tasks", function(){
    assert.strictEqual(hero1.tasks.length, 4);
  });

  it("should be able to sort their tasks by difficulty", function(){
    assert.deepEqual(hero1.sortTasksBy("difficulty"), [task4, task3, task2, task1]);
  });

  it("should be able to sort their tasks by urgency", function(){
    assert.deepEqual(hero1.sortTasksBy("urgency"), [task1, task4, task3, task2]);
  });

  it("should be able to sort their tasks by reward", function(){
    assert.deepEqual(hero1.sortTasksBy("reward"), [task2, task1, task4, task3]);
  });

  it("should be able to view tasks that are marked as completed", function(){
    assert.deepEqual(hero1.findTasks(true), [task1, task4]);
  });

  it("should be able to view tasks that are marked as incomplete", function(){
    assert.deepEqual(hero1.findTasks(false), [task2, task3]);
  });

});
