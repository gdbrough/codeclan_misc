var guitars = ["Fender", "Gibson", "Gretsch"];

// var guitars = new Array();

console.log(guitars);

var drums = [];

drums.push("yamaha");
drums.push("gretsch");

console.log(drums);

console.log(guitars[0]);
console.log(guitars[-1]);
console.log(guitars[100]);

drums[1] = "zildjian";
console.log(drums);

drums[10] = "red";
drums.push("new item")
console.log(drums);
console.log(drums.length);

//remove first item
drums.shift();
console.log(drums);

//remove last item
drums.pop();
console.log(drums);

drums.unshift("Yamaha")
console.log(drums);

var firstTwoGuitars = guitars.slice(0, 2);
console.log(firstTwoGuitars);

// guitars.splice(0, 0, "New Item 0");
// console.log(guitars);

// var indexToRemove = guitars.indexOf("Gibson");
// guitars.splice(indexToRemove, 1);
// console.log(guitars);

var numbers = [1,2,3,4,5,6,7,8,9,10];
evens = numbers.filter(x => x % 2 === 0);
console.log(evens);

var gGuitars = guitars.filter(guitar => guitar.startsWith("G"));
console.log(gGuitars);


guitars[10] = "New Guitar";
console.log(guitars[6]);
var realGuitars = guitars.filter(guitar => guitar != undefined);
console.log(realGuitars);
console.log(guitars);
var naeGuitars = guitars.filter(guitar => guitar == undefined);
console.log(naeGuitars);
