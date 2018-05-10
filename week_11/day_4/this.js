// function add(a, b){
//   console.log(this);
//   return a + b;
// }
//
// add(5,3);

// var car = {
//   speed: 0,
//   accelerate: function(){
//     console.log(this);
//     this.speed += 10;
//   },
//   decelerate: function(){
//     this.speed -= 10;
//   }
// }
//
// car.accelerate();
// console.log(car.speed);
// console.log(this);

function Animal(type, legs){
  this.type = type;
  this.legs = legs;
  this.loginfo = function(){
    console.log(this === myCat);
    console.log(this);
    console.log("The " + this.type + " has " + this.legs + " legs.");
  }
}

var myCat = new Animal("cat", 4);
myCat.loginfo();

setTimeout(myCat.loginfo.bind(myCat), 1000);
