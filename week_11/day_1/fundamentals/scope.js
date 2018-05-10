// var name = "Graeme";
//
// const talk = function(){
//   var name = "John";
//   console.log("My name is " + name);
// };
//
// const walk = function(){
//   console.log(name + " is walking.");
// };
//
// talk();
// console.log("The Global name", name);
// walk();


var globalVariable = 99;

var separateFunction = function() {
  separateA = 2;
};

var outerFunction = function() {

  var outerA = 1;
  separateFunction();
  var innerFunction = function() {
    console.log('outerA ', outerA);
    console.log('globalVariable', globalVariable)
    console.log('separateA ', separateA);
  };

  innerFunction()

};

outerFunction();
