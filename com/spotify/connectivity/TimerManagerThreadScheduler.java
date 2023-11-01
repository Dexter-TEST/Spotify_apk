package com.spotify.connectivity.TimerManagerThreadScheduler;
import com.spotify.connectivity.Scheduler;
import com.spotify.clientfoundations.concurrency.async.Scheduler;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.Runnable;

public final class TimerManagerThreadScheduler implements Scheduler	// class@0005c6 from classes.dex
{
    private final Scheduler timerManagerThread;

    public void TimerManagerThreadScheduler(Scheduler p0){
       co5.o(p0, "timerManagerThread");
       super();
       this.timerManagerThread = p0;
    }
    public void post(Runnable p0){
       co5.o(p0, "callback");
       this.timerManagerThread.post(p0);
    }
}
