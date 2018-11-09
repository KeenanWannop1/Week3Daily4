package com.example.admin.week3daily4.main;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.support.v4.app.NotificationCompat;

import com.example.admin.week3daily4.R;

import static com.example.admin.week3daily4.main.MainPresenter.CHANNEL_ID;

public class MediaService extends Service {
    MediaPlayer player;
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    @Override
    public int onStartCommand(Intent intent, int flags, int startId){
        Intent notificationIntent = new Intent(this,MainView.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this,0
        ,notificationIntent, 0);
        Notification notification = null;
        notification = new NotificationCompat.Builder(this, CHANNEL_ID)
                .setContentTitle("Music Service")
                .setContentText("Led Zeppelin")
                .setSmallIcon(R.drawable.ic_android)
                .setVisibility(Notification.VISIBILITY_PUBLIC)
                .setContentIntent(pendingIntent)
                .build();
        player.start();
        player.setVolume(100,100);
        player.setLooping(true);
        startForeground(1,notification);
        return START_NOT_STICKY;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        player = MediaPlayer.create(this, R.raw.foolintherain);
    }

    @Override
    public void onDestroy() {
        player.stop();
        player.release();
        super.onDestroy();
    }
}
