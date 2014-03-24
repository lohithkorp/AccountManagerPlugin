package com.am.accountmanager; 


import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;

import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;

import java.util.regex.Pattern;

import android.util.Log;
import android.util.Patterns;


public class accountmanager extends CordovaPlugin {

public static final String ACTION_AM = "accManager"; 

public void execute(String action, JSONArray args, Context context) throws JSONException 
{ 


if (ACTION_AM.equals(action)) {  
	try{
Pattern emailPattern = Patterns.EMAIL_ADDRESS;           
Account[] accounts = AccountManager.get(context).getAccounts();
for (Account account : accounts) {
    if (emailPattern.matcher(account.name).matches()) {
        String possibleEmail = account.name;
        PluginResult result = new PluginResult(PluginResult.Status.OK, possibleEmail);
    }
}
	}
	
	catch (Exception e){
		
		PluginResult result = new PluginResult(PluginResult.Status.ERROR);
		
	}
}
	else {
		
	PluginResult result = new PluginResult(PluginResult.Status.INVALID_ACTION);
	String logId = null;
	Log.d(logId, "Invalid Action :" +action+ "passed");
		
	}	
}
    
}


