package com.spotify.connectivity.sessionservice.DefaultSharedNativeSession;
import com.spotify.connectivity.sessionapi.SharedNativeSession;
import com.spotify.connectivity.auth.NativeSession;
import p.sw0;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.tw0;
import com.spotify.clientfoundations.concurrency.async.Scheduler;
import com.spotify.connectivity.sessionservice.DefaultSharedNativeSession$release$1;
import java.lang.Runnable;

public final class DefaultSharedNativeSession implements SharedNativeSession	// class@000819 from classes.dex
{
    private final sw0 coreThreadingApi;
    private NativeSession internalNativeSession;
    private int refCount;

    public void DefaultSharedNativeSession(NativeSession p0,sw0 p1){
       co5.o(p0, "nativeSession");
       co5.o(p1, "coreThreadingApi");
       super();
       this.coreThreadingApi = p1;
       this.internalNativeSession = p0;
       this.refCount = 1;
    }
    public static final NativeSession access$getInternalNativeSession$p(DefaultSharedNativeSession p0){
       return p0.internalNativeSession;
    }
    public synchronized NativeSession acquire(){
       this.refCount = this.refCount + 1;
       return this.internalNativeSession;
    }
    public synchronized boolean alive(){
       boolean b = (this.refCount != null)? true: false;
       return b;
    }
    public final sw0 getCoreThreadingApi(){
       return this.coreThreadingApi;
    }
    public synchronized void release(){
       int i = this.refCount - 1;
       this.refCount = i;
       if (!i) {
          if (this.coreThreadingApi.a.isCurrentThread()) {
             this.internalNativeSession.destroy();
          }else {
             this.coreThreadingApi.a.runBlocking(new DefaultSharedNativeSession$release$1(this));
          }
       }
       return;
    }
}
