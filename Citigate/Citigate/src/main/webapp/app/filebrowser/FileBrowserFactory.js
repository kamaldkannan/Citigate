//app.factory('DirectoryStructureResource', function($resource) {
//	var resource = $resource('../rest/directoryStructre', {
//		'queryAll' : {
//			method : 'GET',
//			isArray : true
//		}
//	});
//	return resource;
//});


app.factory('DirectoryStructureResource', function($resource) {
	var resource = $resource('../rest/directoryStructure', {
		dirId : '@id'
	}, {
		'queryAll' : {
			method : 'GET',
			isArray : true
		},
		'query' : {
			method : 'GET',
			isArray : false
		},
		'update' : {
			method : 'PUT'
		}
	});
	return resource;
});


app.factory('FileInfoResource', function($resource) {
	var resource = $resource('../rest/files', {
		fileId : '@id'
	}, {
		'queryAll' : {
			method : 'GET',
			isArray : true
		},
		'query' : {
			method : 'GET',
			isArray : false
		},
		'update' : {
			method : 'PUT'
		}
	});
	return resource;
});