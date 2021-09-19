// Initialize the Module
var app = angular.module('EBTMap', []);
// Initialize the Controller to send data to the html file
app.controller('MainController', ['$scope', function($scope){
// Simple list with hello world as we send data through the scope
    $scope.list = ["Hello", "World"]
}])