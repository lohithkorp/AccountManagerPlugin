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


if ACTION_EX_PLUGIN.equals(action)) {   
Pattern emailPattern = Patterns.EMAIL_ADDRESS;           
Account[] accounts = AccountManager.get(context).getAccounts();
for (Account account : accounts) {
    if (emailPattern.matcher(account.name).matches()) {
        String possibleEmail = account.name;
        
    }
}
return true;

}
    
return false;


}

private void echo(String message, CallbackContext callbackContext) 
{            
if (message != null && message.length() > 0) 
{                
callbackContext.success(message);            
} 
else 
{                
callbackContext.error("Expected one non-empty string argument.");            
}        
}


}