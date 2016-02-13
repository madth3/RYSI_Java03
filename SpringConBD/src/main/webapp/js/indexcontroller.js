//indexcontroller.js
var AppClubs = angular.module('AppClubs',[]);

AppClubs.controller('mostrarClubs', function($scope, $http){
    
    $scope.saludo = "Hola mundo";
    
    // Llamada a URL "/clubs" de Spring con callback
    $http.get('clubs')   
            .success(function(data, status){
                $scope.listaCompletaDeClubs = data;
            });
});