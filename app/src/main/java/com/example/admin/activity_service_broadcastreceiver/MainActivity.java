package com.example.admin.activity_service_broadcastreceiver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    String msg=" Android: ";
    Button btnPlay,btnPause,btnStop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(msg,"On create");

        anhXa();
        batSuKien();
    }

    private void anhXa() {
        btnPause= (Button) findViewById(R.id.btnPause);
        btnPlay= (Button) findViewById(R.id.btnPlay);
        btnStop= (Button) findViewById(R.id.btnStop);
    }

    private void batSuKien(){
        btnPlay.setOnClickListener(this);
        btnStop.setOnClickListener(this);
        btnPause.setOnClickListener(this);
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

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btnPlay){
            Intent play=new Intent(MainActivity.this,ServicePlayMusic.class);
            startService(play);
        }else if(v.getId()==R.id.btnPause){

        }else if(v.getId()==R.id.btnStop){
            Intent stop=new Intent(MainActivity.this,ServicePlayMusic.class);
            stopService(stop);
        }
    }
}
