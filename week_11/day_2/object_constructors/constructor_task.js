var Planet = function(name){
  this.name = name;
};

var SolarSystem = function(name){
  this.name = name;
  this.planets = [];
  this.newPlanet = function(addedPlanet){
    this.planets.push(addedPlanet);
  };
};

planet1 = new Planet("myFirstPlanet");
planet2 = new Planet("mySecondPlanet");
planet3 = new Planet("myThirdPlanet");

solarSystem1 = new SolarSystem("mySolarSystem");

console.log(planet1.name);

solarSystem1.newPlanet(planet1);

console.log(solarSystem1.planets);

solarSystem1.newPlanet(planet3);

console.log(solarSystem1.planets);
