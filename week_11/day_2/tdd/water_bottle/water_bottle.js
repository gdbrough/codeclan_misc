var WaterBottle = function(){
  this.volume = 0;
}

WaterBottle.prototype.fill = function() {
  this.volume = 100;
};

module.exports = WaterBottle;
