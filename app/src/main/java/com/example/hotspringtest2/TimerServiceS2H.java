package com.example.hotspringtest2;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.SystemClock;

public class TimerServiceS2H extends Service {

    private Handler handler2H = new Handler();
    private long startTime = 0L;
    private long timeInMilliseconds = 0L;
    private int seconds = 0;

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        startTimer();
        return super.onStartCommand(intent, flags, startId);
    }
    private void startTimer() {
        startTime = SystemClock.uptimeMillis();
        handler2H.postDelayed(updateTimerThread, 1000);
    }
    private Runnable updateTimerThread = new Runnable() {
        public void run() {
            // 计算经过的时间（秒）
            timeInMilliseconds = SystemClock.uptimeMillis() - startTime;
            seconds = (int) (timeInMilliseconds / 1000);

            handler2H.postDelayed(this, 1000); // 每秒更新一次计时器
        }
    };
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}


