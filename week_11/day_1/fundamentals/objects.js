const myPerson = {
  name: "Guybrush",
  age: 32,
  weapon: "cutlass",
  talk: function(){
    console.log("shiver me timbers, my name is " + this.name);
  }
}

// console.log("my person", myPerson);

console.log(myPerson.weapon);
myPerson.name = "Guybrush Threepwood";
myPerson.age += 1;
console.log(myPerson);

myPerson.occupation = "Mighty pirate";
console.log(myPerson);

myPerson.talk();

console.log(myPerson["name"]);

const keyToAccess = "age";
console.log(myPerson[keyToAccess]);

const object = {};
const anotherObject = Object.create(null);
const oneLastObject = new Object();

const keys = Object.keys(myPerson);

for(let key of keys){
  console.log("key:", key, "value:", myPerson[key]);
}

const bear = {
  type: "brown",
  name: "Charlie",
  belly: 0,
  eat: function(){
    this.belly += 1;
    console.log("Nom nom");
  }
}

console.log(bear);
bear.eat();
console.log(bear);
