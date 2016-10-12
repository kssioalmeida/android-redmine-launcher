package br.com.kssioalmeida.redminelauncher.helper;

import android.util.Log;

/**
 * Created by calmeida on 10/10/16.
 */

public class Logger {
    private static final String TAG = "REDMINE_APP";

    public static void debug(String s){
        Log.d(TAG, s);
    }
}
