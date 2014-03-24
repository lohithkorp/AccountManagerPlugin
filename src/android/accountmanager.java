package com.am.accountmanager; 


import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;

import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;

import android.accounts.Account;
import android.accounts.AccountManager;
import java.util.regex.Pattern;
import android.util.Patterns;


public class accountmanager extends CordovaPlugin {

public static final String ACTION_AM = "accManager"; 

@Overridepublic boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException 
{ 
  if (ACTION_EX_PLUGIN(action)) {
            	try{
            		    Pattern emailPattern = Patterns.EMAIL_ADDRESS;           
                        Account[] accounts = AccountManager.get(context).getAccounts();
                        for (Account account : accounts) {
                            if (emailPattern.matcher(account.name).matches()) {
                                    String possibleEmail = account.name;
                                     result = new PluginResult(PluginResult.Status.OK, possibleEmail);
                                 }
                            
                         }
                                
            	    }
            	catch(Exception e){
            		
                    result = new PluginResult(PluginResult.Status.Error);
            		
            	}
            	else {
                    result = new PluginResult(PluginResult.Status.INVALID_ACTION);
                    Log.d(logId, "Invalid action : "+action+" passed");
            }
        

        return result;
               
            }



}




