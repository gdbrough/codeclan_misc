var express = require("express");
var app = express();

app.get("/", function(req, res){
  // res.json({data: "S'up dude?"});
  res.sendFile(__dirname + "/index.html");
});

app.use(express.static("public"));

app.listen(3000, function(){
  console.log("App running on port " + this.address().port);
});
