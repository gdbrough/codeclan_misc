const _ = require("lodash");

var Hero = function(name, health, favouriteFood) {
  this.name = name;
  this.health = health;
  this.favouriteFood = favouriteFood;
  this.tasks = [];
}

Hero.prototype.talk = function (name) {
  return "Hello, my name is " + name + "."
};

Hero.prototype.eat = function (food) {
  if(food.name === this.favouriteFood) {
    this.health += (food.value * 1.5);
    return "Nom nom nom, very nice " + food.name + ".";
  } else {
    this.health += food.value;
    return "Nom nom nom, nice " + food.name + ".";
  };
};

Hero.prototype.addTask = function (task) {
  this.tasks.push(task);
};

Hero.prototype.sortTasksBy = function (priority) {
  var sortedTasks = _.orderBy(this.tasks, priority, ["desc"]);
  return sortedTasks
};

Hero.prototype.findTasks = function (taskStatus) {
  var foundTasks = _.filter(this.tasks, task => task.isComplete === taskStatus);
  return foundTasks;
};

module.exports = Hero;
