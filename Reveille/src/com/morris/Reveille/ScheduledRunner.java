package com.morris.Reveille;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledRunner {
    Calendar calendar = Calendar.getInstance();

    public ScheduledRunner() {
        this.calendar.set(Calendar.HOUR, 7);
        this.calendar.set(Calendar.MINUTE, 30);
        this.calendar.set(Calendar.SECOND, 0);
        this.calendar.set(Calendar.AM_PM, Calendar.AM);
    }

    public void reveille() {
        Long currentTime = new Date().getTime();
        if (calendar.getTime().getTime() < currentTime) {
            calendar.add(Calendar.DATE, 1);
        }
        Long startScheduler = calendar.getTime().getTime() - currentTime;

        calendar.set(Calendar.HOUR, 5);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.AM_PM, Calendar.PM);

        Long stopScheduler = calendar.getTime().getTime() - currentTime;

        Runnable task = new Runnable() {
            @Override
            public void run() {
                try {
                    Reveille reveille = new Reveille();
                    reveille.play();
                } catch (UnsupportedAudioFileException | InterruptedException | LineUnavailableException | IOException e) {
                    e.printStackTrace();
                }

            }
        };

        final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.scheduleAtFixedRate(task, startScheduler, stopScheduler, TimeUnit.MILLISECONDS);
    }
}