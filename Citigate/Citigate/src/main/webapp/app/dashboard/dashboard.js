
app.config(function config( $stateProvider ) {
  $stateProvider.state( 'dashboard', {
    url: '/dashboard',
    views: {
      "main": {
        controller: 'DashBoardCtrl',
        templateUrl: 'dashboard/dashboard.tpl.html'
      }
    },
    data:{ pageTitle: 'Dashboard' }
  });
})

.controller( 'DashBoardCtrl', function HomeController( $scope) {
    $scope.isLoggedIn = true;
})

;

