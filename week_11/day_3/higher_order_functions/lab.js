const functionCaller = function(myCallback, number){
  return myCallback(number);
};

const increment = function(number){
  return number += 1;
};

const decrement = function(number){
  return number -= 1;
}

const square = function(number){
  return Math.pow(number, 2);
};

const squareRoot = function(number){
  return Math.sqrt(number);
}

const doSomeMathsForMe = function(number, action){
  return action(number);
};

console.log(doSomeMathsForMe(3, increment));
console.log(doSomeMathsForMe(3, decrement));
console.log(doSomeMathsForMe(3, square));
console.log(doSomeMathsForMe(3, squareRoot));
console.log(doSomeMathsForMe(1, Math.tan));
