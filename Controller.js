// Combined the two to make data transfer more convenient
// Angular Section

// Initialize the Module
var app = angular.module('EBTMap', []);
// Initialize the Controller to send data to the html file
app.controller('MainController', function($scope, $http){
    window.initFirst = () => {
        $http({
            method:'GET',
            url: 'https://cs-4800-group-11.github.io/text.json'
        }).then(function successCallback(response){
            var people = JSON.parse(JSON.stringify(response)).data.records;
            $scope.peoples = people
        }, function errorCallback(response){
        });
        // Recieves data from backend
    //    $http({
    //        method:'GET',
        // This is just the url for stores
    //        url: '/stores.json'
    //    }).then(function successCallback(response){
    //        var store = JSON.parse(JSON.stringify(response)).data.records;
    //        $scope.stores = response.data;
    //    }, function errorCallback(response){
    //        console.log("Error in getting stores");
    //    });
        $http({
            method:'POST',
            //Place holder to test posting. To make it work just put like /post or /currentlocation or something
            url: '/currentlocation',
            data: current_location
        }).then(function successCallback(response){
            console.log("Send Data: "+JSON.stringify(current_location));
        }, function errorCallback(response){
            console.log("error in sending current location");
        });
    }
});




