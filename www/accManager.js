cordova.define("com.am.accountmanager.accountmanager", function(require, exports, module) 
{ 
var exec = require("cordova/exec");


function accManager() { }

accManager.prototype.getLaunchParams = function (successCallback, errorCallback) {
    if (errorCallback == null) {
        errorCallback = function () {
        };
    }

    if (typeof errorCallback != "function") {
        console.log("accManager.getLaunchParams failure: failure parameter not a function");
        return;
    }

    if (typeof successCallback != "function") {
        console.log("accManager.getLaunchParams failure: success callback parameter must be a function");
        return;
    }

exec(successCallback,errorCallback,'accountmanager','accManager');
};


module.exports = new accManager();

});