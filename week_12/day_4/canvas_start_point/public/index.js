window.addEventListener("DOMContentLoaded", function(){
  const canvas = document.querySelector("#main-canvas");
  // console.log("canvas", canvas);
  const context = canvas.getContext("2d")
  // console.log("context", context);
  // draw rectangle
  context.fillStyle = "lightgoldenrodyellow";
  context.fillRect(10, 10, 50, 50);
  context.fillStyle = "tomato";
  context.fillRect(60, 60, 50, 50);

  //draw line
  context.strokeStyle = "hotpink";
  context.beginPath();
  context.moveTo(100,100);
  context.lineTo(100,200);
  context.stroke();

  //draw triangle
  context.beginPath();
  context.moveTo(200,200);
  context.lineTo(200,300);
  context.lineTo(100,300);
  context.closePath();
  context.stroke();
  context.fillStyle = "lightgoldenrodyellow";
  context.fill();

  //draw circle
  const drawCircle = function(x,y){
    context.beginPath();
    context.arc(x,y,75,0, Math.PI * 2, true);
    context.stroke();
    context.fill();
  };

  canvas.addEventListener("mousemove", function(event){
    // console.log("clicked", event);
    // console.log("location", event.x, event.y);
    drawCircle(event.x, event.y);
  });

  const img = document.createElement("img");
  img.src = "https://pbs.twimg.com/profile_images/788554727378325505/8lzc7jXx_reasonably_small.jpg";

  const drawImg = function(x, y){
    context.drawImage(img, x, y, 90, 90);
  }

  img.addEventListener("load", drawImg);

  const changeColour = function(){
    context.strokeStyle = this.value;
  };

  const colourPicker = document.querySelector("#input-colour");
  colourPicker.addEventListener("change", changeColour);

})
