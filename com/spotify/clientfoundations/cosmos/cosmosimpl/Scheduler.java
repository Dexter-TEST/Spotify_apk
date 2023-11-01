package com.spotify.clientfoundations.cosmos.cosmosimpl.Scheduler;
import java.lang.Runnable;

public interface abstract Scheduler	// class@000576 from classes.dex
{

    boolean isOnSchedulerThread();
    void post(Runnable p0);
}
