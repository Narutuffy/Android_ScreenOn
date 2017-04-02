package com.vamsi.screenon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_DISMISS_KEYGUARD);
        setContentView(R.layout.activity_main);
    }

    public void broadcastIntent(View view){
        Intent intent= new Intent();
        intent.setAction("com.vamsi.CUSTOM_INTENT");
        sendBroadcast(intent);
    }

}
