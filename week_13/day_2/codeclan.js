use codeclan;
db.dropDatabase();

db.students.insert([{
  name: "Chris",
  favFood: "pizza"
},
{
  name: "Danny",
  favFood: "Burgers"
}]);

db.students.find();

db.instructors.insert([{
  name: "Colin",
  favFood: "knowledge"
},
{
  name: "Louise",
  favFood: "Peanut Butter"
}]);

db.instructors.find();

show collections;
