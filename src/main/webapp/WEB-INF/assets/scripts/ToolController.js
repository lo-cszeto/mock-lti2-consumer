/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

app.controller('ToolsController', ['$scope', '$http', function($scope, $http) {
    $scope.loading = true;
    $http({method: 'GET', url: 'api/tools'})
    .success(function(data, status, headers, config) {
        $scope.tools = data;
        $scope.loading = false;
    })
    .error(function(data, status, headers, config) {
        $scope.error = true;
        $scope.loading = false;
    });
}]);