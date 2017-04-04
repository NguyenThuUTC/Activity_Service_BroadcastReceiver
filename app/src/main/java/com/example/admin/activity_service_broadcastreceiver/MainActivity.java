package com.example.admin.activity_service_broadcastreceiver;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    String msg=" Android: ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(msg,"On create");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(msg,"onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(msg,"On Restart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(msg,"onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(msg,"On Stop");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(msg,"On Resume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(msg,"OnDestroy");
    }
}
