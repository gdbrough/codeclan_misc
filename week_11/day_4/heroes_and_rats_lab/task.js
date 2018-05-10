var Task = function(name, difficulty, urgency, reward, isComplete) {
  this.name = name;
  this.difficulty = difficulty;
  this.urgency = urgency;
  this.reward = reward;
  this.isComplete = isComplete;
}

Task.prototype.setTaskAsComplete = function () {
  if(!this.isComplete){
    this.isComplete = true;
  }
};





module.exports = Task;
