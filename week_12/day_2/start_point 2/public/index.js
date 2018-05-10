var clickTimes = 0;

var app = function(){
  const button = document.querySelector("button");
  button.addEventListener("click", handleButtonClick);

  const input = document.querySelector("input");
  input.addEventListener("keyup", handleKeyPress);

  const select = document.querySelector("select");
  select.addEventListener("change", handleSelectChange);
};

var handleButtonClick = function(){
  clickTimes += 1;
  const pTag = document.querySelector("#button-result");
  pTag.innerText = "Woa dude, I got totally clicked " + clickTimes + " times.";
};

var handleKeyPress = function(){
  var pTag = document.querySelector("#text-result");
  pTag.innerText = this.value;
}

var handleSelectChange = function(event){
  var pTag = document.querySelector("#select-result");
  pTag.innerText = event.srcElement.value;
  // console.log(event);
}

window.addEventListener('load', app);
