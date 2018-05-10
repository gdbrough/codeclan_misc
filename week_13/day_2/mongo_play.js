use farm;
db.dropDatabase();

use farm;
db.animals.insert({
  name: "Erik",
  type: "Polar Bear"
});
db.animals.insert({
  name: "Pingu",
  type: "Penguin"
});
db.animals.insert({
  name: "Fred",
  type: "horse"
})

db.animals.find();

db.animals.find({name: "Erik"});

db.animals.update({name: "Fred"}, {
  $set: {type: "Goose"}
})

db.animals.find();

db.animals.remove({name: "Fred"});

db.animals.find();
