package com.spotify.clientfoundations.cosmos.cosmosimpl.NativeRunnable;
import java.lang.Runnable;
import java.lang.Object;

public final class NativeRunnable implements Runnable	// class@000575 from classes.dex
{
    private long nThis;

    private void NativeRunnable(){
       super();
    }
    public native final void destroy();
    public native final void internalRun();
    public void run(){
       this.internalRun();
       this.destroy();
    }
}
