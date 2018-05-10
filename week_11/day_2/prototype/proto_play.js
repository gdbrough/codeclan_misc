// var myPerson = Object.create(null);
// myPerson.walk = function(){
//   console.log("left right left right");
// };
//
// var wisePerson = {
//   wisdom = function(){
//     console.log("Commit often");
//   };
// };
//
// var myPerson = Object.create(wisePerson);
// myPerson.walk = function(){
//   console.log("left right left right");
// };
//
// myPerson.wisdom();

///  ^^^^^^ bad inheritance technique
///  vvvvvv good inheritance technique

var Fish = function(name, colour){
  this.name = name;
  this.colour = colour;
};

Fish.prototype = {
  swim: function(){
    console.log("fishity swim");
  }
};

var myFish = new Fish("nemo", "orange");
myFish.swim();
console.log(myFish.name);

// Object.getPrototypeOf(myFish);
console.log(Object.getPrototypeOf(myFish));  //ES6
console.log(myFish.__proto__);  //ES5
