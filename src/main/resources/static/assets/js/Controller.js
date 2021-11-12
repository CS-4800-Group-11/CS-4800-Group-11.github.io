// Combined the two to make data transfer more convenient
// Angular Section
var stores = []
var distance_amount = 0
var num_stores = 0
// Initialize the Module
var app = angular.module('EBTMap', []);
// Initialize the Controller to send data to the html file
app.controller('MainController', function($scope, $http){
    window.initFirst = () => {
        distance_amount = document.getElementById("distance").value
        num_stores = document.getElementById("store_number").value
        $http({
            method:'GET',
            url: 'http://ec2-13-52-81-37.us-west-1.compute.amazonaws.com:8080/nearestStores?latitude='+ current_location.lat +'&longitude='+ current_location.lng +'&distance='+ distance_amount +'&limit='+ num_stores
        }).then(function successCallback(response){
            stores = JSON.parse(JSON.stringify(response)).data;
            console.log(stores);
        }, function errorCallback(response){
        });
    }
});
