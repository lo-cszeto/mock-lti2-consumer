var app = angular.module('mock-consumer', ['ui.router']);

app.config(function($stateProvider, $urlRouterProvider) {
    //
    // For any unmatched url, redirect to /state1
    $urlRouterProvider.otherwise("/tools");
    //
    // Now set up the states
    $stateProvider
    .state('intro', {
        url: "/manual",
        templateUrl: "assets/templates/partial-manual.html"
    })
    .state('tools', {
        url: "/tools",
        templateUrl: "assets/templates/partial-tools.html"
    });

}).run(function($rootScope, $state) {
    $rootScope.$state = $state;
});