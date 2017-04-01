package com.vamsi.screenon;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Vamsi Rao on 4/2/2017.
 */

public class ScreenOnReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"Intent Detected",Toast.LENGTH_SHORT).show();
    }
}
