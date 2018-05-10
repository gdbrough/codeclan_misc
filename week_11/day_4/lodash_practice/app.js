const _ = require("lodash");

const people = [
  {name: "John", age: 37, favouriteCheese: "Brie"},
  {name: "Christie", age: 30, favouriteCheese: "Jarlsberg"},
  {name: "Elie", age: 37, favouriteCheese: "Manchego"},
  {name: "Louise", age: 29, favouriteCheese: "Brie"}
];

console.log(_.filter(people, {favouriteCheese: "Brie"}));
console.log(" ");
console.log(_.sortBy(people, ["age", "name"]));
console.log(" ");
// (_.remove(people, person => person.age < 37));
// console.log(people);
console.log(" ");
let average = _.meanBy(people, "age");
console.log(average);
