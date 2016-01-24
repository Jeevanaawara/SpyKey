package com.codex.jeevanaawara.spykey;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.util.Log;

/**
 * Created by jeevanaawara on 25-Jan-16.
 */
public class MyBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("APP", "Intent RECEIVED : " + intent.getAction());
        if(intent != null){

            Bundle bundle = intent.getExtras();
            if(bundle != null){
                Log.i("APP", "Bundle : "+bundle);
            }
        }
    }
}
