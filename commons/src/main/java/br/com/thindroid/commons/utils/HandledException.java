package br.com.thindroid.commons.utils;

import android.util.Log;

/**
 * Created by Carlos on 26/11/2015.
 */
public class HandledException extends RuntimeException {
    public HandledException(String message){
        super(message);
    }

    public static HandledException buildWithLog(String TAG, int logLevel, Exception ex, String message){
        Log.println(logLevel, TAG, Log.getStackTraceString(ex));
        return new HandledException(message);
    }
}
