package com.example.android_num_27_service;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

import androidx.annotation.Nullable;

public class MyService extends Service {
    private  MediaPlayer playermusic;
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    public MyService() {
        super();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        playermusic = MediaPlayer.create(getApplicationContext(), R.raw.goodnight);
        playermusic.setLooping(true);
        playermusic.start();
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        playermusic.stop();
    }
}