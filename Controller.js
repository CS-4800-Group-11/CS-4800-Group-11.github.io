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
});