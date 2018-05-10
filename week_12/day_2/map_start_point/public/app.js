const initialise = function(){
  // console.log("this is working");
  const container = document.getElementById("main-map");
  const center = {lat: -50.6067956, lng:165.968396};
  const zoom = 14;

  const map = new MapWrapper(container, center, zoom);
  map.addMarker(center);
  // map.addMarker({lat: -50.6097956, lng:165.969396})
  const bounceButton = document.getElementById("button-bounce-markers");
  bounceButton.addEventListener("click", map.bounceMarkers.bind(map));

  map.addClickEvent();

}

window.addEventListener("DOMContentLoaded", initialise);
