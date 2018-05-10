var name = "john";

if (name === "john"){
  console.log("OHAI JOHN");
}

var counter = 1;

if (counter > 0){
  console.log("The counter is greater than zero");
} else if (counter === 0){
  console.log("The counter is equal to zero");
} else {
  console.log("The counter is less than zero");
}

var pet = "cat";

switch(pet){
  case "cat":
    console.log("ITZ A KAT");
    break;
  case "dog":
    console.log("ITZ A DUG");
    break;
  default:
    console.log("SOMETHING ELSE, MAYBE A SNEK");
}

1 + 1 === 2 ? console.log("Yay maths"): console.log("Nae maths");
