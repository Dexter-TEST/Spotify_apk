package com.spotify.clientfoundations.concurrency.async.Scheduler;
import java.lang.Runnable;

public interface abstract Scheduler	// class@00054d from classes.dex
{

    boolean isCurrentThread();
    void post(Runnable p0);
    void runBlocking(Runnable p0);
}
