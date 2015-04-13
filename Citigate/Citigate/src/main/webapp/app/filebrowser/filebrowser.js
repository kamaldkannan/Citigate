app.config(function config( $stateProvider ) {
  $stateProvider.state( 'filebrowser', {
    url: '/filebrowser',
    views: {
      "main": {
        controller: 'FileBrowserCtrl',
        templateUrl: 'filebrowser/filebrowser.tpl.html'
      }
    },
    data:{ pageTitle: 'File Browser' }
  });
})

app.controller('FileBrowserCtrl',  function FileBrowserCtrl1($scope,DirectoryStructureResource,FileInfoResource) {
//    var
//        nameList = ['Pierre', 'Pol', 'Jacques', 'Robert', 'Elisa'],
//        familyName = ['Dupont', 'Germain', 'Delcourt', 'bjip', 'Menez'];
//
//    function createRandomItem() {
//        var
//            firstName = nameList[Math.floor(Math.random() * 4)],
//            lastName = familyName[Math.floor(Math.random() * 4)],
//            age = Math.floor(Math.random() * 100),
//            email = firstName + lastName + '@whatever.com',
//            balance = Math.random() * 3000;
//
//        return{
//            firstName: firstName,
//            lastName: lastName,
//            age: age,
//            email: email,
//            balance: balance
//        };
//    }
	$scope.rowCollection =[];

    $scope.itemsByPage=4;

    $scope.rowCollection =  FileInfoResource.queryAll();
//    for (var j = 0; j < 200; j++) {
//        $scope.rowCollection.push(createRandomItem());
//    }
//    
    $scope.groups1 = DirectoryStructureResource.queryAll();
   /*
    $scope.groups1 =  [
                                    {
                                        label: 'CME',
                                        children: [
                                          {
                                            label: 'IRS',
                                            data: {
                                              description: "CME/IRS"
                                            },
                                          children: [
                                                     {
                                                       label: '20150101',
                                                       data: {
                                                         description: "CME/IRS/20150101"
                                                       }
                                                     }, {
                                                       label: '20150102',
                                                       data: {
                                                         description: "CME/IRS/20150102"
                                                       }
                                                     }, {
                                                       label: 'Archive',
                                                       data: {
                                                         description: "CME/IRS/Archive"
                                                       }
                                                     }
                                                   ]
                                          }, {
                                            label: 'CDS',
                                            data: {
                                              description: "CME/CDS"
                                            },
                                            children: [
                                                       {
                                                         label: '20150101',
                                                         data: {
                                                           description: "CME/CDS/20150101"
                                                         }
                                                       }, {
                                                         label: '20150102',
                                                         data: {
                                                           description: "CME/CDS/20150101"
                                                         }
                                                       }, {
                                                         label: 'Archive',
                                                         data: {
                                                           description: "CME/FX"
                                                         }
                                                       }
                                                     ]
                                            
                                          }, {
                                            label: 'FX',
                                            data: {
                                              description: "CME/FX"
                                            },
                                            children: [
                                                       {
                                                         label: '20150101',
                                                         data: {
                                                           description: "CME/IRS/20150101"
                                                         }
                                                       }, {
                                                         label: '20150102',
                                                         data: {
                                                           description: "CME/CDS"
                                                         }
                                                       }, {
                                                         label: 'Archive',
                                                         data: {
                                                           description: "CME/FX"
                                                         }
                                                       }
                                                     ]
                                            
                                          }
                                        ]
                                      },
                                      {
                                          label: 'LCH',
                                          children: [
                                            {
                                              label: 'IRS',
                                              data: {
                                                description: "LCH/IRS"
                                              },
                                            children: [
                                                       {
                                                         label: '20150101',
                                                         data: {
                                                           description: "LCH/IRS/20150101"
                                                         }
                                                       }, {
                                                         label: '20150102',
                                                         data: {
                                                           description: "CME/CDS"
                                                         }
                                                       }, {
                                                         label: 'Archive',
                                                         data: {
                                                           description: "LCH/FX"
                                                         }
                                                       }
                                                     ]
                                            }, {
                                              label: 'CDS',
                                              data: {
                                                description: "LCH/CDS"
                                              },
                                              children: [
                                                         {
                                                           label: '20150101',
                                                           data: {
                                                             description: "LCH/IRS/20150101"
                                                           }
                                                         }, {
                                                           label: '20150102',
                                                           data: {
                                                             description: "CME/CDS"
                                                           }
                                                         }, {
                                                           label: 'Archive',
                                                           data: {
                                                             description: "CME/FX"
                                                           }
                                                         }
                                                       ]
                                              
                                            }, {
                                              label: 'FX',
                                              data: {
                                                description: "CME/FX"
                                              },
                                              children: [
                                                         {
                                                           label: '20150111',
                                                           data: {
                                                             description: "CME/IRS/20150101"
                                                           }
                                                         }, {
                                                           label: '20150102',
                                                           data: {
                                                             description: "CME/CDS"
                                                           }
                                                         }, {
                                                           label: 'Archive',
                                                           data: {
                                                             description: "CME/FX"
                                                           }
                                                         }
                                                       ]
                                              
                                            }
                                          ]
                                        }
                                      ];*/
    
});