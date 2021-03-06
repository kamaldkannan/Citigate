angular.module( 'citigateWeb', [
  'citigateWeb.home',
  'citigateWeb.about',
  'citigateWeb.account',
  'citigateWeb.blog',
  'ui.router',
  'hateoas'
])

.config( function myAppConfig ( $stateProvider, $urlRouterProvider, HateoasInterceptorProvider) {
  $urlRouterProvider.otherwise( '/home' );
  HateoasInterceptorProvider.transformAllResponses();
})

.run( function run () {
})

.controller( 'AppCtrl', function AppCtrl ( $scope, $location ) {
  $scope.$on('$stateChangeSuccess', function(event, toState, toParams, fromState, fromParams){
    if ( angular.isDefined( toState.data.pageTitle ) ) {
      $scope.pageTitle = toState.data.pageTitle + ' | citigateWeb' ;
    }
  });
})

;

