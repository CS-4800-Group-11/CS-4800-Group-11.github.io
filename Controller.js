// Combined the two to make data transfer more convenient
// Angular Section

// Initialize the Module
var app = angular.module('EBTMap', []);
// Initialize the Controller to send data to the html file
app.controller('MainController', function($scope, $http){
    // The format should be very similar to the prof's example
    $http({
        method:'GET',
        url: 'https://cs-4800-group-11.github.io/text.json'
    }).then(function successCallback(response){
        var people = JSON.parse(JSON.stringify(response)).data.records;
        $scope.peoples = people
    }, function errorCallback(response){
    });
    // Recieves data from backend
    $http({
        method:'GET',
        url: '/stores.txt'
    }).then(function successCallback(response){
        $scope.students = response.data;
    }, function errorCallback(response){
        console.log("Error in getting stores");
    });

    $http({
        method:'POST',
        url: '/currentLocation.txt',
        data: current_location
    }).then(function successCallback(response){
        console.log("Send Data: "+current_location.lat + " "+ current_location.lng);
    }, function errorCallback(response){
        console.log("error in sending current location");
    });
});




