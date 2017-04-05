package com.example.admin.activity_service_broadcastreceiver;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by admin on 4/5/2017.
 */

public class ServicePlayMusic extends Service{
    MediaPlayer play;
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        play=MediaPlayer.create(getApplicationContext(),R.raw.bucthutinhthu2);
        Toast.makeText(this, "listenning music", Toast.LENGTH_SHORT).show();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        play.start();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        play.release();
        Toast.makeText(this, "Stop", Toast.LENGTH_SHORT).show();
    }
}
