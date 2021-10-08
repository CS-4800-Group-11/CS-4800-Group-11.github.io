let map;

function initMap() {
  var location = {
    lat: 34.049332,
    lng: -117.814583
  }
  var options = {
    center: location,
    zoom: 20
  }
  const Science_Building = {lat: 34.058515, lng: -117.824858};
  if (navigator.geolocation){
    console.log("Geolocation Supported");
    navigator.geolocation.getCurrentPosition((loc) => {
        location.lat = loc.coords.latitude;
        location.lng = loc.coords.longitude;
        map = new google.maps.Map(document.getElementById("map"), options);
    },
    (err) => {
        console.log("User Clicked No");
        map = new google.maps.Map(document.getElementById("map"), options);
    }
    )
  } else{
    console.log("Geolocation Not Supported");
    map = new google.maps.Map(document.getElementById("map"), options);
  }
  autocomplete = new google.maps.places.Autocomplete(document.getElementById("search"),
  {
    componentRestrictions:{'country':['us']},
    fields: ['geometry', 'name'],
    types: ['geocode']
  });

  autocomplete.addListener("place_changed", () => {
    const place = autocomplete.getPlace();
    console.log(place);
    location.lat = place.geometry.location.lat();
    location.lng = place.geometry.location.lng();
    new google.maps.Marker({
        position: place.geometry.location,
        title: place.name,
        map: map
    })
    map = new google.maps.Map(document.getElementById("map"), options);
  });

//  var list = [location, Science_Building];
//  var ob = [];
//  for (let i=0;i<list.length;i++){
//    ob[i] = new google.maps.Marker({
//            position: list[i],
//            map: map,
//     });
//  }
}



