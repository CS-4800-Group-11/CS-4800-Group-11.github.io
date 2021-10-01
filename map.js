let map;

function initMap() {
  const Pomona = { lat: 34.049332, lng: -117.814583 };
  const Science_Building = {lat: 34.058515, lng: -117.824858};
  const map = new google.maps.Map(document.getElementById("map"), {
    zoom: 16,
    center: Pomona,
  });
  var list = [Pomona, Science_Building];
  var ob = [];
  for (let i=0;i<list.length;i++){
    ob[i] = new google.maps.Marker({
            position: list[i],
            map: map,
     });
  }
}


