package com.vamsi.screenon;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.widget.Toast;

/**
 * Created by Vamsi Rao on 4/2/2017.
 */

public class OnScreenOffReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        AppContext appContext= (AppContext) context.getApplicationContext();



        if(Intent.ACTION_SCREEN_OFF.equals(intent.getAction())){
            wakeUpDevice(appContext);
            Toast.makeText(context,"Intent Detected for Screen Wake",Toast.LENGTH_SHORT).show();

        }
        else{
            Toast.makeText(context,"Intent Detected for custom Action",Toast.LENGTH_SHORT).show();
        }

    }

    private void wakeUpDevice(AppContext context) {
        PowerManager.WakeLock wakeLock = context.getWakeLock(); // get WakeLock reference via AppContext
        if (wakeLock.isHeld()) {
            wakeLock.release(); // release old wake lock
        }

        // create a new wake lock...
        wakeLock.acquire();

        // ... and release again
        wakeLock.release();
    }

}
