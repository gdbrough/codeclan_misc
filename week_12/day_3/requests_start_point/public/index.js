var countries;

const makeRequest = function(url, callback){
  const request = new XMLHttpRequest();
  request.open("GET", url);
  request.addEventListener("load", callback);
  request.send();
};

const requestComplete = function(){
  if (this.status !== 200) return;
  const jsonString = this.responseText;
  countries = JSON.parse(jsonString);
  populateList(countries);
};

const populateList = function(countries){
  const select = document.getElementById("countries-select");
  select.onchange = displayCountry;

  let option = document.createElement("option");
  option.value = "select";
  option.innerText  = "Select a Country";
  select.appendChild(option);
  // countries.forEach(function(country){
  for (let index in countries){
    let option = document.createElement("option");
    option.value = index;
    option.innerText = countries[index].name;
    select.appendChild(option);
  };
};

const displayCountry = function(event){
  // console.log(countries[this.value].name);
  const borderDisplay = document.getElementById("display-bordering-countries");
  while(borderDisplay.firstChild){
    borderDisplay.removeChild(borderDisplay.firstChild);
  }
  const display = document.getElementById("country-display");
  display.innerHTML = "Name: " + countries[this.value].name +
    "<br />Population: " + countries[this.value].population +
    "<br />Capital: " + countries[this.value].capital +
    "<br /><img id=\"flag\" src=\"" + countries[this.value].flag + "\">";
    save(countries[this.value]);
    if (countries[this.value].borders.length){
      displayBorderingCountries(countries[this.value].borders);
    };
};

const displayBorderingCountries = function(borders){
  const borderDisplay = document.getElementById("display-bordering-countries");
  // console.log(borders);;
  // borderDisplay.removeChild(paragraph)
  borders.forEach(function(border){
    // console.log();
    boardingCountry = _.find(countries, country => country.alpha3Code === border);
    // console.log(boardingCountry);
    const paragraph = document.createElement("p");
    paragraph.innerHTML= "Name: " + boardingCountry.name +
      "<br />Population: " + boardingCountry.population +
      "<br />Capital: " + boardingCountry.capital;
    borderDisplay.appendChild(paragraph)
  });
}

const save = function(countryToSave){
  var savejsonString = JSON.stringify(countryToSave);
  localStorage.setItem("country", savejsonString);
}

const app = function(){
    const url = "https://restcountries.eu/rest/v2/all";
    makeRequest(url, requestComplete);
}

window.addEventListener("load", app);
