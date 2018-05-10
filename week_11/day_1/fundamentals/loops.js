var pets = ["dog", "cat", "snake", "parrot"];

for (var i = 0; i < pets.length; i++){
  console.log(pets[i]);
}

for (var pet of pets){
  console.log(pet);
}

for (var thing in pets){
  console.log(thing);
}

var person = {
  "name": "John",
  "age": 37
};

for (var key in person){
  console.log(key);
  console.log(person[key]);
  console.log(key +": " + person[key]);
}

var x = 0

while (x < 10) {
  console.log("loop " + x);
  x++;
}
