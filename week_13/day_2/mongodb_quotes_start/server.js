const express = require('express');
const parser = require('body-parser');
const server = express();

server.use(parser.json());
server.use(express.static('client/build'));
server.use(parser.urlencoded({extended: true}));

const MongoClient = require("mongodb").MongoClient;
const ObjectID = require("mongodb").ObjectID;
MongoClient.connect("mongodb://localhost:27017", function(err, client){
  if(err){
    console.log(err);
    return;
  }

  const db = client.db("star_wars");
  console.log("connected to DB");
//CRUD Stuff

  server.post("/api/quotes", function(req, res){
    const quotesCollection = db.collection("quotes");
    const quoteToSave = req.body;
    quotesCollection.save(quoteToSave, function(err, result){
      if(err){
        console.log(err);
        res.status(500);
        res.send();
      }
      console.log("Something was saved successfully to DB");
      res.status(201);
      res.json(quoteToSave);
    });
  });

  server.get("/api/quotes", function(req, res){
    const quotesCollection = db.collection("quotes");
    quotesCollection.find().toArray(function(err, allQuotes){
      if(err){
        console.log(err);
        res.status(500);
        res.send();
      }
      res.json(allQuotes);
    });
  });

  server.delete("/api/quotes", function(req, res){
    const quotesCollection = db.collection("quotes");
    // quotesCollection.deleteMany(function(err, allQuotes){
    const filterObject = {};
    quotesCollection.deleteMany(filterObject, function(err, allQuotes){
      if(err){
        console.log(err);
        res.status(500);
        res.send();
      }
      res.status(204);
      res.send();
    });
  });

  server.put("/api/quotes/:id", function(req, res){
    const quotesCollection = db.collection("quotes");
    const objectId = ObjectID(req.params.id);
    const filterObject = { _id: objectId };
    const updatedData = req.body;
    quotesCollection.update(filterObject, updatedData, function(err, result){
      if(err){
        console.log(err);
        res.status(500);
        res.send();
      }
      res.status(204);
      res.send();
    });
  });

  server.listen(3000, function(){
    console.log("Listening on port 3000");
  });

});
