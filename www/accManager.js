var accManager =  
{   

createEvent: function(successCallback, errorCallback)
{        
cordova.exec(            
successCallback, // success callback function            
errorCallback, // error callback function            
'accountmanager', // mapped to our native Java class called "accountmanager"            
'accManager', // with this action name
);
}
}

module.exports = accManager;