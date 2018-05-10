// function hello(){
//   return "Hello everyone";
// }
//
// console.log("the return value is ", hello());

// function mood(name, mood, weather){
//   console.log(`${name} you are ${mood}, despite the ${weather}.`);
// };
//
// mood("Graeme", "learning new stuff", "rain");

// function add(a,b){
//   return a + b;
// }
//
// console.log("the return value is", add(1,2,3));

// function sum(){
//   let total = 0;
//   for(let argument of arguments){
//     total += argument;
//   }
//   return total;
// }
//
// console.log(sum(1,2,3,4));

// const hello = function(){
//   console.log("hiya!");
// }
//
// hello();


// const mood



// Create a function that takes in the first name and surname, and speaks eg "Howdy, I am Rick Henry"

function greeting(firstName, lastName){
  return `Howdy, I am ${firstName} ${lastName}`;
}

console.log(greeting("Rick", "Henry"));


// Create a multiply function, returning the result.

function multiply(num1, num2){
  return num1 * num2;
}

console.log(multiply(2,3));

// Create a function that takes in an array and returns the first element.

function firstElement(array){
  return array[0];
}

console.log(firstElement([3,4,5,6,12]));

// Create a function that takes in a list of names of any length, and prints them all to screen.

function printNames(){
  let names = "";
  for(let name of arguments){
    names += (name + " ")
  }
  return names;
}

console.log(printNames("Graeme", "Paul", "Christie", "Ria"));

// Create an array of animal names and a function that adds the animals to a farm array and prints the names to the console.

const animalArray = ["cow", "pig", "sheep", "chicken"];

function addToFarm(animalsArray){
  let farmArray = [];
  for (animal of animalsArray){
    farmArray.push(animal)
  }
  // for (let i = 0; i < animalsArray.length; i++){
  //   farmArray.push(animalArray[i]);
  // }
  return farmArray;
}

console.log(addToFarm(animalArray));
